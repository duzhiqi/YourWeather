package com.dzq.yourweather.model.bean.weather;

import com.dzq.yourweather.model.bean.BasicBean;

import java.util.List;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class HourlyWeather {


    /**
     * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.319000","lon":"120.165000","update":{"loc":"2016-11-25 18:12","utc":"2016-11-25 10:12"}}
     * hourly_forecast : [{"cond":{"code":"305","txt":"小雨"},"date":"2016-11-25 19:00","hum":"83","pop":"39","pres":"1026","tmp":"10","wind":{"deg":"256","dir":"西南风","sc":"微风","spd":"5"}},{"cond":{"code":"305","txt":"小雨"},"date":"2016-11-25 22:00","hum":"86","pop":"77","pres":"1026","tmp":"10","wind":{"deg":"339","dir":"西北风","sc":"微风","spd":"5"}}]
     * status : ok
     */

    private BasicBean basic;
    private String status;
    private List<HourlyForecastBean> hourly_forecast;

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<HourlyForecastBean> getHourly_forecast() {
        return hourly_forecast;
    }

    public void setHourly_forecast(List<HourlyForecastBean> hourly_forecast) {
        this.hourly_forecast = hourly_forecast;
    }


}
