package com.dzq.yourweather.presenter;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public interface ITestPresenter {

    void getWeeklyWeather(String cityInfo);

    void getNowWeather(String cityIfo);

    void getHourlyWeather(String cityIfo);

    void getLifeSuggestion(String cityIfo);

    void getDamageAlarm(String cityIfo);
}
