package cn.scfl.bean;

/*
* 用户跟进信息
* */

public class UserFollowInfo {
    private String follow_status;      //经销商跟进状态，示例，H 级
    private String follow_time;        //经销商跟进时间，示例，2019-09-09 11:22:22

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

    public UserFollowInfo(String follow_status, String follow_time) {
        this.follow_status = follow_status;
        this.follow_time = follow_time;
    }
}
