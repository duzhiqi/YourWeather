package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class WindBean {
    /**
     * deg : 70
     * dir : 西北风
     * sc : 3-4
     * spd : 11
     */

    private String deg;
    private String dir;
    private String sc;
    private String spd;

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

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

    public String getSpd() {
        return spd;
    }

    public void setSpd(String spd) {
        this.spd = spd;
    }
}
