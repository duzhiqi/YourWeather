package com.dzq.yourweather.model.bean.domain;

import com.dzq.yourweather.model.bean.BasicBean;
import com.dzq.yourweather.model.bean.NowBean;

import java.util.List;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class NowWeather {

    /**
     * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.319000","lon":"120.165000","update":{"loc":"2016-11-29 15:54","utc":"2016-11-29 07:54"}}
     * now : {"cond":{"code":"101","txt":"多云"},"fl":"12","hum":"62","pcpn":"0","pres":"1031","tmp":"12","vis":"10","wind":{"deg":"60","dir":"东风","sc":"3-4","spd":"13"}}
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

