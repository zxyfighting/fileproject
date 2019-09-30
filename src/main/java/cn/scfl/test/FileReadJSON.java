package cn.scfl.test;

import cn.scfl.bean.AllInfo;
import cn.scfl.bean.UserBaseInfo;
import cn.scfl.bean.UserFollowInfo;
import cn.scfl.bean.UserUseCarInfo;
import cn.scfl.util.KafkaUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.VoidFunction;
import com.alibaba.fastjson.JSONObject;
import java.util.Iterator;

public class FileReadJSON {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf();
        sparkConf.setMaster("local[2]");
        sparkConf.set("spark.testing.memory","2147000000");
        sparkConf.setAppName("spark-streamingScfl");
        JavaSparkContext sc = new JavaSparkContext(sparkConf);
        JavaRDD<String> data =sc.textFile("F:\\datagen1.txt", 2);
        data.foreachPartition(new VoidFunction<Iterator<String>>() {

            private static final long serialVersionUID = 1L;
            @Override
            public void call(Iterator<String> datas) throws Exception {
                while(datas.hasNext())
                {
                    //切分
                    String [] value =datas.next().split(",");
                    AllInfo allinfo = new AllInfo(value[0], value[1],Integer.
                            decode(value[2].toString()), value[3], value[4],
                            value[5],value[6], value[7], Double.valueOf(value[8].toString()) ,
                            value[9], value[10], value[11], value[12], value[13], value[14], value[15],
                            value[16], value[17], value[18], value[19], value[20], value[21], value[22],
                            value[23], value[24], value[24], value[25],value[26]);

                    UserBaseInfo userbaseinfo = new UserBaseInfo(value[0], value[1],
                            Integer.decode(value[2].toString()), value[3],value[4],
                            value[5], value[6], value[7], Double.valueOf(value[8].toString()) ,
                            value[9], value[10], value[11], value[12], value[13], value[14]);

                    UserFollowInfo userFollowInfo = new UserFollowInfo(value[15], value[16]);

                    UserUseCarInfo userUseCarInfo = new UserUseCarInfo(value[17], value[18],
                            value[19], value[20], value[21], value[22], value[23],
                            value[24], value[24], value[25],value[26]);

                    //创建jackson的核心对象 ObjectMapper
                    ObjectMapper mapper = new ObjectMapper();
                    JSONObject js = null ;
                    try {
                        //将对象转换为json 并发送数据
                        String userBase = mapper.writeValueAsString(userbaseinfo);
                        String userFollow = mapper.writeValueAsString(userFollowInfo);
                        String userUserCar = mapper.writeValueAsString(userUseCarInfo);
                        js = new JSONObject();
                        js.put("msg","成功");
                        js.put("code","0");
                        JSONObject js1 = new JSONObject();
                        js1.put("user_base_info",userbaseinfo);
                        js1.put("user_follow_info",userFollowInfo);
                        js1.put("user_use_car_info",userUseCarInfo);
                        js.put("data",js1);
                        System.out.println(js);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                    //将json 字符串发送kafka
                    KafkaUtil produce = new KafkaUtil();
                    produce.produce(js.toJSONString());
                };

            }
        });


    }
}
