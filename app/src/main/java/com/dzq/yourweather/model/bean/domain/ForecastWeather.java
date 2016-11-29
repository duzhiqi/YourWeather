package com.dzq.yourweather.model.bean.domain;

import com.dzq.yourweather.model.bean.BasicBean;
import com.dzq.yourweather.model.bean.DailyForecastBean;

import java.util.List;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */
public class ForecastWeather {
    /**
     * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.319000","lon":"120.165000","update":{"loc":"2016-11-29 15:54","utc":"2016-11-29 07:54"}}
     * daily_forecast : [{"astro":{"mr":"06:02","ms":"17:05","sr":"06:36","ss":"16:58"},"cond":{"code_d":"101","code_n":"104","txt_d":"多云","txt_n":"阴"},"date":"2016-11-29","hum":"83","pcpn":"0.1","pop":"16","pres":"1031","tmp":{"max":"13","min":"8"},"uv":"3","vis":"10","wind":{"deg":"86","dir":"东风","sc":"微风","spd":"7"}},{"astro":{"mr":"06:54","ms":"17:48","sr":"06:37","ss":"16:58"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-11-30","hum":"83","pcpn":"0.1","pop":"2","pres":"1029","tmp":{"max":"13","min":"5"},"uv":"4","vis":"10","wind":{"deg":"342","dir":"北风","sc":"微风","spd":"7"}},{"astro":{"mr":"07:45","ms":"18:33","sr":"06:38","ss":"16:58"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2016-12-01","hum":"77","pcpn":"0.0","pop":"0","pres":"1031","tmp":{"max":"13","min":"5"},"uv":"4","vis":"10","wind":{"deg":"13","dir":"东北风","sc":"微风","spd":"6"}},{"astro":{"mr":"08:34","ms":"19:23","sr":"06:39","ss":"16:58"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2016-12-02","hum":"77","pcpn":"0.0","pop":"0","pres":"1031","tmp":{"max":"13","min":"5"},"uv":"3","vis":"10","wind":{"deg":"92","dir":"东北风","sc":"微风","spd":"7"}},{"astro":{"mr":"09:22","ms":"20:15","sr":"06:40","ss":"16:58"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-12-03","hum":"81","pcpn":"0.0","pop":"0","pres":"1026","tmp":{"max":"16","min":"6"},"uv":"4","vis":"10","wind":{"deg":"106","dir":"东风","sc":"微风","spd":"7"}},{"astro":{"mr":"10:06","ms":"21:09","sr":"06:40","ss":"16:58"},"cond":{"code_d":"101","code_n":"104","txt_d":"多云","txt_n":"阴"},"date":"2016-12-04","hum":"75","pcpn":"0.0","pop":"0","pres":"1021","tmp":{"max":"16","min":"7"},"uv":"-999","vis":"10","wind":{"deg":"268","dir":"南风","sc":"微风","spd":"4"}},{"astro":{"mr":"10:49","ms":"22:05","sr":"06:41","ss":"16:58"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-12-05","hum":"68","pcpn":"0.0","pop":"1","pres":"1023","tmp":{"max":"14","min":"5"},"uv":"-999","vis":"10","wind":{"deg":"276","dir":"北风","sc":"微风","spd":"4"}}]
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

    @Override
    public String toString() {
        return "ForecastWeather{" +
                "basic=" + basic +
                ", status='" + status + '\'' +
                ", daily_forecast=" + daily_forecast +
                '}';
    }
}
