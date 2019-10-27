package cn.scfl.bean;

public class UserInfo {
    private String userid;        //用户的登录账号
    private String phoneNo;       //客户电话号码

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public UserInfo(String userid, String phoneNo) {
        this.userid = userid;
        this.phoneNo = phoneNo;
    }
}
