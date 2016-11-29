package com.dzq.yourweather.presenter.impl;

import android.util.Log;

import com.dzq.yourweather.model.bean.DailyForecastBean;
import com.dzq.yourweather.model.bean.domain.ForecastWeather;
import com.dzq.yourweather.model.http.RetrofitHelper;
import com.dzq.yourweather.model.http.WeatherResponse;
import com.dzq.yourweather.presenter.ITestPresenter;
import com.dzq.yourweather.ui.ITestActivity;

import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class TestPresenterImpl extends BasePresenterImpl implements ITestPresenter{

    private RetrofitHelper mRetrofitHelper;
    private ITestActivity mView;

    public TestPresenterImpl(ITestActivity view){
        this.mRetrofitHelper = new RetrofitHelper();
        mView = view;
    }
    @Override
    public void getWeeklyWeather(final String cityInfo) {


        mRetrofitHelper.obtainForecastWeather("hangzhou")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<ForecastWeather>, Observable<ForecastWeather>>() {
                    @Override
                    public Observable<ForecastWeather> call(WeatherResponse<ForecastWeather> forecastWeatherResponse) {
                        List<ForecastWeather> results = forecastWeatherResponse.getResults();
                        return Observable.from(results);
                    }
                }).subscribe(new Observer<ForecastWeather>() {
            @Override
            public void onCompleted() {
                Log.e("dzq", "onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.e("dzq", "onError:" + e.toString());
            }

            @Override
            public void onNext(ForecastWeather forecastWeather) {
                List<DailyForecastBean> daily_forecast = forecastWeather.getDaily_forecast();
                for (DailyForecastBean dailyForecastBean : daily_forecast) {
                    Log.i("dzq", "dailyForecastBean:" + dailyForecastBean.toString());
                }
                Log.e("dzq", "onNext: " + daily_forecast.toString());
            }
        });

    }
}
