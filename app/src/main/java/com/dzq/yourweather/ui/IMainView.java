package com.dzq.yourweather.ui;

import com.dzq.yourweather.model.bean.CondBean;

/**
 * Description:
 * Created by duzhiqi on 2016/12/1.
 */

public interface IMainView extends BaseView {

    void showNowWeather(String nowWeatherInfo);

    void setContent(CondBean cond);
}
