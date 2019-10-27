package cn.scfl.bean;

public class LoginData {
    private Boolean succeed;      //是否登录成功
    private Boolean firstLogin;   //是否是首次登录

    public Boolean getSucceed() {
        return succeed;
    }

    public void setSucceed(Boolean succeed) {
        this.succeed = succeed;
    }

    public Boolean getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    public LoginData(Boolean succeed, Boolean firstLogin) {
        this.succeed = succeed;
        this.firstLogin = firstLogin;
    }
}
