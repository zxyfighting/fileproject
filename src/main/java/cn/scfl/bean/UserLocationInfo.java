package cn.scfl.bean;

public class UserLocationInfo {
    private Double latitude;      //用户位置（纬 度）
    private Double longitude;     //用户位置（经 度）

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public UserLocationInfo(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
