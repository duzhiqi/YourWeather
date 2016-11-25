package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class BasicBean {

    /**
     * city : 杭州
     * cnty : 中国
     * id : CN101210101
     * lat : 30.319000
     * lon : 120.165000
     * update : {"loc":"2016-11-25 16:54","utc":"2016-11-25 08:54"}
     */

    private String city;
    private String cnty;
    private String id;
    private String lat;
    private String lon;
    private UpdateBean update;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCnty() {
        return cnty;
    }

    public void setCnty(String cnty) {
        this.cnty = cnty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public UpdateBean getUpdate() {
        return update;
    }

    public void setUpdate(UpdateBean update) {
        this.update = update;
    }

}
