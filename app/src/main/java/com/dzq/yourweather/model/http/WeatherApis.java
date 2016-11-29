package com.dzq.yourweather.model.http;

import com.dzq.yourweather.model.bean.domain.DamageAlarm;
import com.dzq.yourweather.model.bean.domain.ForecastWeather;
import com.dzq.yourweather.model.bean.domain.HourlyWeather;
import com.dzq.yourweather.model.bean.domain.LifeSuggestion;
import com.dzq.yourweather.model.bean.domain.NowWeather;
import com.dzq.yourweather.model.bean.domain.SceneWeather;
import com.dzq.yourweather.model.bean.domain.SearchCity;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Description: WeatherApis
 * Created by dzq on 2016/11/25.
 */

public interface WeatherApis {

    //7-10天预报
    @GET("forecast")
    Observable<WeatherResponse<ForecastWeather>> getForecastWeather
            (@Query("city") String city, @Query("key") String key);

    //即时天气
    @GET("now")
    Observable<WeatherResponse<NowWeather>> getNowWeather
            (@Query("city") String city, @Query("key") String key);

    //每小时预报
    @GET("hourly")
    Observable<WeatherResponse<HourlyWeather>> getHourlyWeather
            (@Query("city") String city, @Query("key") String key);

    //生活建议
    @GET("suggestion")
    Observable<WeatherResponse<LifeSuggestion>> getLifeSuggestion
            (@Query("city") String city, @Query("key") String key);

    //灾害预警
    @GET("alarm")
    Observable<WeatherResponse<DamageAlarm>> getDamageAlarm
            (@Query("city") String city, @Query("key") String key);

//    //包括7-10天预报、实况天气、每小时天气、灾害预警、生活指数、空气质量，一次获取足量数据
//    @GET("weather")
//    Observable<WeatherResponse<Weather>> getWeather
//            (@Query("city") String city, @Query("key") String key);

    //全国4A和5A级景点共2000＋的7天天气预报
    @GET("scenic")
    Observable<WeatherResponse<SceneWeather>> getSceneWeather
            (@Query("city") String city, @Query("key") String key);

    //通过此接口获取城市信息，例如通过名称获取城市ID，建议使用城市ID获取天气数据，避免重名城市导致的混淆
    @GET("search")
    Observable<WeatherResponse<SearchCity>> getSearchCity
            (@Query("city") String city, @Query("key") String key);

    @GET("search")
    Observable<JsonObj> getSearchCityObj
            (@Query("city") String city, @Query("key") String key);
}
