package cn.scfl.bean;

public class AllInfo {
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

    private String follow_status;      //经销商跟进状态，示例，H 级
    private String follow_time;        //经销商跟进时间，示例，2019-09-09 11:22:22

    private String pay_way;             //用户最终购车方式，示例，全款
    private String pay_model;           //用户最终购买的车型dms 对应编码，示例，000001
    private String pay_vin;             //车架号vin码，示例LSVHJ133022221761
    private String pay_model_name;      //用户最终购买的车型名称，示例，红旗HS5 2019款 2.0T 智联旗享版
    private String pay_model_price;     //用户最终购买车型裸车价格，示例，18.98 万
    private String pay_color;           //用户购买车型颜色，示例，鲜红色
    private String pay_time;            //用户下定时间，示例，2019-09-09 11:22:22
    private String license_number;      //车牌号，示例，京A88888
    private String premium_due_time;    //保险到期时间，示例，2019-09-09 11:22:22
    private String maintenance_records; //回店保养记录，示例，2019-09-09 11:22:22 换机油
    private String maintain_records;    //维修记录，示例，2019-09-01 11:22:22 发动机维护

    public String getPay_way() {
        return pay_way;
    }

    public void setPay_way(String pay_way) {
        this.pay_way = pay_way;
    }

    public String getPay_model() {
        return pay_model;
    }

    public void setPay_model(String pay_model) {
        this.pay_model = pay_model;
    }

    public String getPay_vin() {
        return pay_vin;
    }

    public void setPay_vin(String pay_vin) {
        this.pay_vin = pay_vin;
    }

    public String getPay_model_name() {
        return pay_model_name;
    }

    public void setPay_model_name(String pay_model_name) {
        this.pay_model_name = pay_model_name;
    }

    public String getPay_model_price() {
        return pay_model_price;
    }

    public void setPay_model_price(String pay_model_price) {
        this.pay_model_price = pay_model_price;
    }

    public String getPay_color() {
        return pay_color;
    }

    public void setPay_color(String pay_color) {
        this.pay_color = pay_color;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getPremium_due_time() {
        return premium_due_time;
    }

    public void setPremium_due_time(String premium_due_time) {
        this.premium_due_time = premium_due_time;
    }

    public String getMaintenance_records() {
        return maintenance_records;
    }

    public void setMaintenance_records(String maintenance_records) {
        this.maintenance_records = maintenance_records;
    }

    public String getMaintain_records() {
        return maintain_records;
    }

    public void setMaintain_records(String maintain_records) {
        this.maintain_records = maintain_records;
    }

    public String getFollow_status() {
        return follow_status;
    }

    public void setFollow_status(String follow_status) {
        this.follow_status = follow_status;
    }

    public String getFollow_time() {
        return follow_time;
    }

    public void setFollow_time(String follow_time) {
        this.follow_time = follow_time;
    }
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

    public AllInfo(String user_id, String user_name, Integer user_age, String user_gender, String user_phone, String nation, String intention_purpose, String user_retention_intention, Double uidance_price, String city_coding, String city, String distributor_code, String distributor, String time, String user_scourse, String follow_status, String follow_time, String pay_way, String pay_model, String pay_vin, String pay_model_name, String pay_model_price, String pay_color, String pay_time, String license_number, String premium_due_time, String maintenance_records, String maintain_records) {
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
        this.follow_status = follow_status;
        this.follow_time = follow_time;
        this.pay_way = pay_way;
        this.pay_model = pay_model;
        this.pay_vin = pay_vin;
        this.pay_model_name = pay_model_name;
        this.pay_model_price = pay_model_price;
        this.pay_color = pay_color;
        this.pay_time = pay_time;
        this.license_number = license_number;
        this.premium_due_time = premium_due_time;
        this.maintenance_records = maintenance_records;
        this.maintain_records = maintain_records;
    }
}
