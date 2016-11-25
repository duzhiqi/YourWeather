package com.dzq.yourweather.model.bean.weather;

import com.dzq.yourweather.model.bean.CondBean;
import com.dzq.yourweather.model.bean.WindBean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class HourlyForecastBean {
    /**
     * cond : {"code":"305","txt":"小雨"}
     * date : 2016-11-25 19:00
     * hum : 83 相对湿度（%）
     * pop : 39 降水概率
     * pres : 1026 气压
     * tmp : 10 温度
     * wind : {"deg":"256","dir":"西南风","sc":"微风","spd":"5"}
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


}
