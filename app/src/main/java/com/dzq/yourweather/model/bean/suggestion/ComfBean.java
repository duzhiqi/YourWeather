package com.dzq.yourweather.model.bean.suggestion;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class ComfBean {
    /**
     * 舒适度指数
     * brf : 较舒适
     * txt : 白天会有降雨，这种天气条件下，人们会感到有些凉意，但大部分人完全可以接受。
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
