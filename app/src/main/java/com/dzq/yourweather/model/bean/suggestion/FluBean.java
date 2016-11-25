package com.dzq.yourweather.model.bean.suggestion;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class FluBean {
    /**
     * 感冒指数
     * brf : 易发
     * txt : 天冷空气湿度大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。
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
