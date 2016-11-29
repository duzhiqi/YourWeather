package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class AqiBean {
    private CityBean city;

    @Override
    public String toString() {
        return "AqiBean{" +
                "city=" + city +
                '}';
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }
}
