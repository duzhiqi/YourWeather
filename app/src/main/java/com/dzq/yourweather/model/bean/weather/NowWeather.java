package com.dzq.yourweather.model.bean.weather;

import com.dzq.yourweather.model.bean.BasicBean;
import com.dzq.yourweather.model.bean.NowBean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class NowWeather {

    /**
     * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.319000","lon":"120.165000","update":{"loc":"2016-11-25 16:54","utc":"2016-11-25 08:54"}}
     * now : {"cond":{"code":"300","txt":"阵雨"},"fl":"7","hum":"95","pcpn":"0.1","pres":"1025","tmp":"6","vis":"1","wind":{"deg":"70","dir":"西北风","sc":"3-4","spd":"11"}}
     * status : ok
     */

    private BasicBean basic;
    private NowBean now;
    private String status;

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
