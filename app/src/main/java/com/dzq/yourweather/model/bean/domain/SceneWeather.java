package com.dzq.yourweather.model.bean.domain;

import com.dzq.yourweather.model.bean.BasicBean;
import com.dzq.yourweather.model.bean.DailyForecastBean;

import java.util.List;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class SceneWeather {
    private BasicBean basic;
    private List<DailyForecastBean> daily_forecast;

    @Override
    public String toString() {
        return "SceneWeather{" +
                "basic=" + basic +
                ", daily_forecast=" + daily_forecast +
                '}';
    }

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public List<DailyForecastBean> getDaily_forecast() {
        return daily_forecast;
    }

    public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
        this.daily_forecast = daily_forecast;
    }
}
