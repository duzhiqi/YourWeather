package com.dzq.yourweather.model.http;


import com.dzq.yourweather.config.Config;
import com.dzq.yourweather.model.bean.Weather;
import com.dzq.yourweather.model.bean.alarm.DamageAlarm;
import com.dzq.yourweather.model.bean.scenci.SceneWeather;
import com.dzq.yourweather.model.bean.search.SearchCity;
import com.dzq.yourweather.model.bean.weather.ForecastWeather;
import com.dzq.yourweather.model.bean.weather.HourlyWeather;
import com.dzq.yourweather.model.bean.weather.NowWeather;
import com.dzq.yourweather.util.SystemUtil;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Description: RetrofitHelper
 * Created by dzq on 2016/11/25.
 */

public class RetrofitHelper {

    private static OkHttpClient okHttpClient = null;
    private static WeatherApis weatherApiService = null;

    private void init() {
        initOkHttp();
        weatherApiService = getWeatherApiService();
    }

    private RetrofitHelper() {
        init();
    }

    private static RetrofitHelper mInstance;

    public static RetrofitHelper getInstance(){
        if (mInstance == null) {
            mInstance = new RetrofitHelper();
        }
        return mInstance;
    }

    private static void initOkHttp() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (Config.isDebug) {
            // https://drakeet.me/retrofit-2-0-okhttp-3-0-config
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
            builder.addInterceptor(loggingInterceptor);
        }
        // http://www.jianshu.com/p/93153b34310e
        File cacheFile = new File(Config.PATH_CACHE);
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 50);
        Interceptor cacheInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                if (!SystemUtil.isNetworkConnected()) {
                    request = request.newBuilder()
                            .cacheControl(CacheControl.FORCE_CACHE)
                            .build();
                }
                Response response = chain.proceed(request);
                if (SystemUtil.isNetworkConnected()) {
                    int maxAge = 0;
                    // 有网络时, 不缓存, 最大保存时长为0
                    response.newBuilder()
                            .header("Cache-Control", "public, max-age=" + maxAge)
                            .removeHeader("Pragma")
                            .build();
                } else {
                    // 无网络时，设置超时为4周
                    int maxStale = 60 * 60 * 24 * 28;
                    response.newBuilder()
                            .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                            .removeHeader("Pragma")
                            .build();
                }
                return response;
            }
        };
        Interceptor apikey = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                request = request.newBuilder()
                        .addHeader("apikey", Config.KEY_API)
                        .build();
                return chain.proceed(request);
            }
        };
        builder.addNetworkInterceptor(cacheInterceptor);
        builder.addInterceptor(cacheInterceptor);
        builder.addInterceptor(apikey);
        builder.cache(cache);
        //设置超时
        builder.connectTimeout(10, TimeUnit.SECONDS);
        builder.readTimeout(20, TimeUnit.SECONDS);
        builder.writeTimeout(20, TimeUnit.SECONDS);
        //错误重连
        builder.retryOnConnectionFailure(true);
        okHttpClient = builder.build();
    }

    private static WeatherApis getWeatherApiService() {
        Retrofit weatherRetrofit = new Retrofit.Builder()
                .baseUrl(Config.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return weatherRetrofit.create(WeatherApis.class);
    }

    public Observable<WeatherResponse<ForecastWeather>> obtainForecastWeather(String cityInfo) {
        return weatherApiService.getForecastWeather(cityInfo, Config.MY_WEATHER_KEY);
    }

    public Observable<WeatherResponse<NowWeather>> obtainNowWeather(String cityInfo) {
        return weatherApiService.getNowWeather(cityInfo, Config.MY_WEATHER_KEY);
    }

    public Observable<WeatherResponse<HourlyWeather>> obtainHourlyWeather(String cityInfo) {
        return weatherApiService.getHourlyWeather(cityInfo, Config.MY_WEATHER_KEY);
    }

    public Observable<WeatherResponse<HourlyWeather>> obtainLifeSuggestion(String cityInfo) {
        return weatherApiService.getLifeSuggestion(cityInfo, Config.MY_WEATHER_KEY);
    }

    public Observable<WeatherResponse<SearchCity>> obtainSearchCity(String cityInfo) {
        return weatherApiService.getSearchCity(cityInfo, Config.MY_WEATHER_KEY);
    }

    public Observable<WeatherResponse<SceneWeather>> obtainSceneWeather(String cityInfo) {
        return weatherApiService.getSceneWeather(cityInfo, Config.MY_WEATHER_KEY);
    }

    public Observable<WeatherResponse<DamageAlarm>> obtainDamageAlarm(String cityInfo) {
        return weatherApiService.getDamageAlarm(cityInfo, Config.MY_WEATHER_KEY);
    }

    public Observable<WeatherResponse<Weather>> obtainAllWeather(String cityInfo) {
        return weatherApiService.getWeather(cityInfo, Config.MY_WEATHER_KEY);
    }
}
