package com.dzq.yourweather.model.http;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class WeatherResponse<T> {

    @SerializedName("HeWeather5")
    private List<T> results;

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
