package com.dzq.yourweather.model.bean.scenci;

import com.dzq.yourweather.model.bean.BasicBean;
import com.dzq.yourweather.model.bean.weather.DailyForecastBean;

import java.util.List;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class SceneWeather {

    /**
     * basic : {"city":"故宫博物院","cnty":"中国","id":"CN10101010018A","lat":"116.39","lon":"39.91","update":{"loc":"2015-07-02 08:10","utc":"2015-07-02 00:10"}}
     * daily_forecast : [{"date":"2015-10-10","astro":{"sr":"06:19","ss":"17:43"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"tmp":{"max":"16","min":"10"},"wind":{"dir":"北风","sc":"3-4"}}]
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
