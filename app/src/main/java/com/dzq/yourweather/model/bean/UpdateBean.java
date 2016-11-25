package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class UpdateBean {
    /**
     * 更新时间
     * loc : 2016-11-25 16:54 当地时间
     * utc : 2016-11-25 08:54 utc时间
     */

    private String loc;
    private String utc;

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getUtc() {
        return utc;
    }

    public void setUtc(String utc) {
        this.utc = utc;
    }
}
