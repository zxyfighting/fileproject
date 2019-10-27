package cn.scfl.bean;

public class WXBaseInfo {
    private String openid;        //openid
    private String nickname;      //用户昵称
    private String gender;        //用户性别
    private String city;          //用户所在城市
    private String country;       //用户所在国家
    private String province;      //用户所在省份
    private String language;      //用户的语言
    private String subscribeTime; //用户关注时间，为时间戳
    private String unionid;       //unionid

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(String subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public WXBaseInfo(String openid, String nickname, String gender,
                      String city, String country, String province, String language,
                      String subscribeTime, String unionid)
    {
        this.openid = openid;
        this.nickname = nickname;
        this.gender = gender;
        this.city = city;
        this.country = country;
        this.province = province;
        this.language = language;
        this.subscribeTime = subscribeTime;
        this.unionid = unionid;
    }
}
