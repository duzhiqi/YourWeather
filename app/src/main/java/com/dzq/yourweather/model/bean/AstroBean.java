package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class AstroBean {
//    天文数值
//    "sr": "06:19",  //日出时间
//     "ss": "17:43" //日落时间
//    "mr": "04:19",   //月升时间
//    "ms": "18:07",   //月落时间

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

    @Override
    public String toString() {
        return "AstroBean{" +
                "mr='" + mr + '\'' +
                ", ms='" + ms + '\'' +
                ", sr='" + sr + '\'' +
                ", ss='" + ss + '\'' +
                '}';
    }
}
