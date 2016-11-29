package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class BasicBean {
//        "city": "天津",  //城市名称
//                "cnty": "中国",   //国家
//                "id": "CN101030100",  //城市ID
//                "lat": "39.117000", //城市维度
//                "lon": "117.246000", //城市经度
//                "prov": "天津"  //城市所属省份（仅限国内城市）
//                "update": {  //更新时间
//            "loc": "2016-08-31 11:52",  //当地时间
//                    "utc": "2016-08-31 03:52" //UTC时间


    private String city;
    private String cnty;
    private String id;
    private String lat;
    private String lon;
    private String prov;
    private UpdateBean update;
    private String loc;

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

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public UpdateBean getUpdate() {
        return update;
    }

    public void setUpdate(UpdateBean update) {
        this.update = update;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
