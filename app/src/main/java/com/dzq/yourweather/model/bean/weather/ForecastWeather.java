package com.dzq.yourweather.model.bean.weather;

import com.dzq.yourweather.model.bean.BasicBean;

import java.util.List;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class ForecastWeather {

    /**
     * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.319000","lon":"120.165000","update":{"loc":"2016-11-25 16:54","utc":"2016-11-25 08:54"}}
     * daily_forecast : [{"astro":{"mr":"02:34","ms":"14:40","sr":"06:33","ss":"16:59"},"cond":{"code_d":"300","code_n":"305","txt_d":"阵雨","txt_n":"小雨"},"date":"2016-11-25","hum":"77","pcpn":"0.3","pop":"93","pres":"1026","tmp":{"max":"9","min":"7"},"uv":"2","vis":"10","wind":{"deg":"82","dir":"北风","sc":"微风","spd":"3"}},{"astro":{"mr":"03:27","ms":"15:14","sr":"06:34","ss":"16:59"},"cond":{"code_d":"305","code_n":"101","txt_d":"小雨","txt_n":"多云"},"date":"2016-11-26","hum":"87","pcpn":"8.0","pop":"100","pres":"1026","tmp":{"max":"10","min":"4"},"uv":"2","vis":"10","wind":{"deg":"341","dir":"西北风","sc":"微风","spd":"4"}},{"astro":{"mr":"04:18","ms":"15:49","sr":"06:35","ss":"16:58"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2016-11-27","hum":"70","pcpn":"0.0","pop":"0","pres":"1028","tmp":{"max":"12","min":"4"},"uv":"4","vis":"10","wind":{"deg":"2","dir":"北风","sc":"微风","spd":"1"}},{"astro":{"mr":"05:10","ms":"16:25","sr":"06:36","ss":"16:58"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-11-28","hum":"74","pcpn":"0.1","pop":"0","pres":"1031","tmp":{"max":"13","min":"6"},"uv":"4","vis":"10","wind":{"deg":"64","dir":"东北风","sc":"微风","spd":"5"}},{"astro":{"mr":"06:02","ms":"17:05","sr":"06:36","ss":"16:58"},"cond":{"code_d":"101","code_n":"305","txt_d":"多云","txt_n":"小雨"},"date":"2016-11-29","hum":"78","pcpn":"0.1","pop":"0","pres":"1031","tmp":{"max":"13","min":"7"},"uv":"4","vis":"10","wind":{"deg":"52","dir":"东北风","sc":"微风","spd":"4"}},{"astro":{"mr":"06:54","ms":"17:48","sr":"06:37","ss":"16:58"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-11-30","hum":"77","pcpn":"0.0","pop":"0","pres":"1031","tmp":{"max":"13","min":"6"},"uv":"-999","vis":"10","wind":{"deg":"360","dir":"北风","sc":"微风","spd":"10"}},{"astro":{"mr":"07:45","ms":"18:33","sr":"06:38","ss":"16:58"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-12-01","hum":"74","pcpn":"0.0","pop":"0","pres":"1032","tmp":{"max":"12","min":"6"},"uv":"-999","vis":"10","wind":{"deg":"8","dir":"北风","sc":"微风","spd":"5"}}]
     * status : ok
     */

    private BasicBean basic;
    private String status;
    private List<DailyForecastBean> daily_forecast;

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

    public List<DailyForecastBean> getDaily_forecast() {
        return daily_forecast;
    }

    public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
        this.daily_forecast = daily_forecast;
    }


}
