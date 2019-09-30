package cn.scfl.bean;

/*
* 客户用车信息
*/

public class UserUseCarInfo {
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

    public UserUseCarInfo(String pay_way, String pay_model, String pay_vin, String pay_model_name, String pay_model_price, String pay_color, String pay_time, String license_number, String premium_due_time, String maintenance_records, String maintain_records) {
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
