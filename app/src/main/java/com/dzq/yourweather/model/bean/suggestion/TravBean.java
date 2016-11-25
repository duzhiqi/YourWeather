package com.dzq.yourweather.model.bean.suggestion;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class TravBean {
    /**
     * 旅游指数
     * brf : 适宜
     * txt : 有降水，稍凉，微风细语，很是浪漫，适宜旅游，可不要错过机会呦！但记得出门要携带雨具。
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
