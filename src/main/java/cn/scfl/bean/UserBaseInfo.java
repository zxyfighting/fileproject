package cn.scfl.bean;

/*
 * purpose：创建用户基本信息
 *
 */

public class UserBaseInfo {
    private String  user_id   ;              //用户id
    private String  user_name ;              //用户姓名
    private Integer user_age  ;              //用户年纪
    private String  user_gender;             //用户性别
    private String  user_phone;              //:"手机号":"13789456220",手机号加密
    private String  nation    ;              //用户名族
    private String  intention_purpose;       //用户留资所选意向车型
    private String  user_retention_intention;//用户留资所选意向车型名称
    private Double  uidance_price;           //用户留资所选意向车型官方指导价格
    private String  city_coding ;            //用户留资选择所在地 dms 对应城市编码
    private String  city;                    //用户留资选择所在地城市名称
    private String  distributor_code;        //用户留资选择经销商 dms 对应编码
    private String  Distributor;             //用户留资选择对应经销商名称
    private String  time;                    //用户留资时间
    private String  user_scourse;            //用户来源

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIntention_purpose() {
        return intention_purpose;
    }

    public void setIntention_purpose(String intention_purpose) {
        this.intention_purpose = intention_purpose;
    }

    public String getUser_retention_intention() {
        return user_retention_intention;
    }

    public void setUser_retention_intention(String user_retention_intention) {
        this.user_retention_intention = user_retention_intention;
    }

    public Double getUidance_price() {
        return uidance_price;
    }

    public void setUidance_price(Double uidance_price) {
        this.uidance_price = uidance_price;
    }

    public String getCity_coding() {
        return city_coding;
    }

    public void setCity_coding(String city_coding) {
        this.city_coding = city_coding;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistributor_code() {
        return distributor_code;
    }

    public void setDistributor_code(String distributor_code) {
        this.distributor_code = distributor_code;
    }

    public String getDistributor() {
        return Distributor;
    }

    public void setDistributor(String distributor) {
        Distributor = distributor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUser_scourse() {
        return user_scourse;
    }

    public void setUser_scourse(String user_scourse) {
        this.user_scourse = user_scourse;
    }

    public UserBaseInfo(String user_id, String user_name, Integer user_age, String user_gender, String user_phone, String nation, String intention_purpose, String user_retention_intention, Double uidance_price, String city_coding, String city, String distributor_code, String distributor, String time, String user_scourse) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_gender = user_gender;
        this.user_phone = user_phone;
        this.nation = nation;
        this.intention_purpose = intention_purpose;
        this.user_retention_intention = user_retention_intention;
        this.uidance_price = uidance_price;
        this.city_coding = city_coding;
        this.city = city;
        this.distributor_code = distributor_code;
        Distributor = distributor;
        this.time = time;
        this.user_scourse = user_scourse;
    }
}
