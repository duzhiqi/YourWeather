package com.dzq.yourweather.model.bean.domain;

import com.dzq.yourweather.model.bean.AlarmsBean;
import com.dzq.yourweather.model.bean.AqiBean;
import com.dzq.yourweather.model.bean.BasicBean;
import com.dzq.yourweather.model.bean.DailyForecastBean;
import com.dzq.yourweather.model.bean.HourlyForecastBean;
import com.dzq.yourweather.model.bean.NowBean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class AllWeather {
    private String status;
    private AlarmsBean alarms;
    private AqiBean aqi;
    private BasicBean basic;
    private DailyForecastBean daily_forecast;
    private HourlyForecastBean hourly_forecast;
    private NowBean now;
    private LifeSuggestion.SuggestionBean suggestion;

    @Override
    public String toString() {
        return "AllWeather{" +
                "status='" + status + '\'' +
                ", alarms=" + alarms +
                ", aqi=" + aqi +
                ", basic=" + basic +
                ", daily_forecast=" + daily_forecast +
                ", hourly_forecast=" + hourly_forecast +
                ", now=" + now +
                ", suggestion=" + suggestion +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AlarmsBean getAlarms() {
        return alarms;
    }

    public void setAlarms(AlarmsBean alarms) {
        this.alarms = alarms;
    }

    public AqiBean getAqi() {
        return aqi;
    }

    public void setAqi(AqiBean aqi) {
        this.aqi = aqi;
    }

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public DailyForecastBean getDaily_forecast() {
        return daily_forecast;
    }

    public void setDaily_forecast(DailyForecastBean daily_forecast) {
        this.daily_forecast = daily_forecast;
    }

    public HourlyForecastBean getHourly_forecast() {
        return hourly_forecast;
    }

    public void setHourly_forecast(HourlyForecastBean hourly_forecast) {
        this.hourly_forecast = hourly_forecast;
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public LifeSuggestion.SuggestionBean getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(LifeSuggestion.SuggestionBean suggestion) {
        this.suggestion = suggestion;
    }
}
