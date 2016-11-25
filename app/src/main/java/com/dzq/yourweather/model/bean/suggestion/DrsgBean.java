package com.dzq.yourweather.model.bean.suggestion;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class DrsgBean {
    /**
     * 穿衣指数
     * brf : 较冷
     * txt : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
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
