package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class WindBean {
    //风力风向
//    "deg": "342",   //风向（360度）
//    "dir": "北风",  //风向
//    "sc": "3-4",   //风力等级
//    "spd": "10"   //风速（kmph）


    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public String getSpd() {
        return spd;
    }

    public void setSpd(String spd) {
        this.spd = spd;
    }

    private String deg;
    private String dir;
    private String sc;
    private String spd;

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }
}
