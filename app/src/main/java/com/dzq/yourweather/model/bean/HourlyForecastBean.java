package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class HourlyForecastBean {
    /**
     * cond : {"code":"101","txt":"多云"}
     * date : 2016-11-29 16:00
     * hum : 77
     * pop : 6
     * pres : 1030
     * tmp : 13
     * wind : {"deg":"65","dir":"东风","sc":"微风","spd":"8"}
     */
    private CondBean cond;
    private String date;
    private String hum;
    private String pop;
    private String pres;
    private String tmp;
    private WindBean wind;

    public CondBean getCond() {
        return cond;
    }

    public void setCond(CondBean cond) {
        this.cond = cond;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getPres() {
        return pres;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public WindBean getWind() {
        return wind;
    }

    public void setWind(WindBean wind) {
        this.wind = wind;
    }

    @Override
    public String toString() {
        return "HourlyForecastBean{" +
                "cond=" + cond +
                ", date='" + date + '\'' +
                ", hum='" + hum + '\'' +
                ", pop='" + pop + '\'' +
                ", pres='" + pres + '\'' +
                ", tmp='" + tmp + '\'' +
                ", wind=" + wind +
                '}';
    }
}
