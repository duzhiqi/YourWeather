package com.dzq.yourweather.model.bean.domain;

import com.dzq.yourweather.model.bean.BasicBean;
import com.dzq.yourweather.model.bean.HourlyForecastBean;

import java.util.List;

/**
 * Description:每小时预报
 * Created by duzhiqi on 2016/11/29.
 */

public class HourlyWeather {

    /**
     * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.319000","lon":"120.165000","update":{"loc":"2016-11-29 15:54","utc":"2016-11-29 07:54"}}
     * hourly_forecast : [{"cond":{"code":"101","txt":"多云"},"date":"2016-11-29 16:00","hum":"77","pop":"6","pres":"1030","tmp":"13","wind":{"deg":"65","dir":"东风","sc":"微风","spd":"8"}},{"cond":{"code":"101","txt":"多云"},"date":"2016-11-29 19:00","hum":"82","pop":"0","pres":"1030","tmp":"10","wind":{"deg":"69","dir":"东风","sc":"微风","spd":"8"}},{"cond":{"code":"104","txt":"阴"},"date":"2016-11-29 22:00","hum":"89","pop":"0","pres":"1030","tmp":"10","wind":{"deg":"79","dir":"东南风","sc":"微风","spd":"5"}}]
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

    @Override
    public String toString() {
        return "HourlyWeather{" +
                "basic=" + basic +
                ", status='" + status + '\'' +
                ", hourly_forecast=" + hourly_forecast +
                '}';
    }
}
