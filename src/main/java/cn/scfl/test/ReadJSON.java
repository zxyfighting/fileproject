package cn.scfl.test;

import cn.scfl.bean.*;
import cn.scfl.util.KafkaUtil;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.VoidFunction;

import java.util.Date;
import java.util.Iterator;

public class ReadJSON {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf();
        sparkConf.setMaster("local[*]");
        sparkConf.set("spark.testing.memory","2147000000");
        sparkConf.setAppName("spark-streamingScfl");
        JavaSparkContext sc = new JavaSparkContext(sparkConf);
        JavaRDD<String> data =sc.textFile("/root/SCFL_DMP/scfl.txt", 2);
        data.foreachPartition(new VoidFunction<Iterator<String>>() {

            private static final long serialVersionUID = 1L;
            @Override
            public void call(Iterator<String> datas) throws Exception {
                while(datas.hasNext())
                {
                    //切分
                    String [] value =datas.next().split(",");
                     WXBaseInfo wxBaseInfo = new WXBaseInfo(value[0],value[1],value[2],value[3],value[4],
                             value[5],value[6],value[7],value[8]);
                     UserLocationInfo userbaseinfo = new UserLocationInfo(Double.valueOf(value[9]),Double.valueOf(value[10]));
                     UserInfo userInfo =new UserInfo(value[11],value[12]);
                     LoginData loginData = new LoginData(Boolean.valueOf(value[13]),Boolean.valueOf(value[14]));
                     VisitData visitData = new VisitData(value[15],value[16],value[17],value[18],value[19]);
                    //创建jackson的核心对象 ObjectMapper
                    ObjectMapper mapper = new ObjectMapper();
                    //创建jackson的核心对象 ObjectMapper
                    JSONObject js = null ;
                    try {
                        String wxBase = mapper.writeValueAsString(wxBaseInfo);
                        String userLocationBase = mapper.writeValueAsString(userbaseinfo);
                        String userBase = mapper.writeValueAsString(userInfo);
                        String loginBase = mapper.writeValueAsString(loginData);
                        String visitBase = mapper.writeValueAsString(visitData);
                    if (value[0].equals("授权")){
                        js = new JSONObject();

                        JSONObject js1 = new JSONObject();
                        js.put("dataType","授权");
                        js1.put("wxInfo",wxBaseInfo);
                        js1.put("addrInfo",userbaseinfo);
                        js1.put("userInfo",userInfo);
                        js.put("data",js1);
                    }
                    else if(value[0].equals("登录")){
                        js = new JSONObject();
                        JSONObject js2 = new JSONObject();
                        js.put("dataType","登录");
                        js2.put("wxInfo",wxBaseInfo);
                        js2.put("addrInfo",userbaseinfo);
                        js2.put("userInfo",userInfo);
                        js2.put("loginData",loginData);
                        js.put("data",js2);

                    }
                    else if(value[0].equals("访问")) {
                        js = new JSONObject();
                        JSONObject js3 = new JSONObject();
                        js.put("dataType","访问");
                        js3.put("wxInfo",wxBaseInfo);
                        js3.put("visitData",visitData);
                        js.put("data",js3);

                    }

                        System.out.println(js);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                    //将json 字符串发送kafka
                    KafkaUtil produce = new KafkaUtil();
                    produce.ProducerDemo();
                    produce.produce(js.toString());
                };

            }
        });


    }
}
