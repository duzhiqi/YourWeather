package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class AstroBean {
    /**
     * 天文数值
     * mr : 02:34 月升时间
     * ms : 14:40 月落时间
     * sr : 06:33 日出时间
     * ss : 16:59 日落时间
     */

    private String mr;
    private String ms;
    private String sr;
    private String ss;

    public String getMr() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr = mr;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }
}
