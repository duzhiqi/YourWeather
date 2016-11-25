package com.dzq.yourweather.model.bean.suggestion;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class CwBean {
    /**
     * 洗车指数
     * brf : 不宜
     * txt : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。
     */

    private String brf;
    private String txt;

    public String getBrf() {
        return brf;
    }

    public void setBrf(String brf) {
        this.brf = brf;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
