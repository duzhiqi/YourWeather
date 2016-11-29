package com.dzq.yourweather.presenter.impl;

import android.util.Log;

import com.dzq.yourweather.model.bean.DailyForecastBean;
import com.dzq.yourweather.model.bean.domain.DamageAlarm;
import com.dzq.yourweather.model.bean.domain.ForecastWeather;
import com.dzq.yourweather.model.bean.domain.HourlyWeather;
import com.dzq.yourweather.model.bean.domain.LifeSuggestion;
import com.dzq.yourweather.model.bean.domain.NowWeather;
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
        mRetrofitHelper.obtainForecastWeather(cityInfo)
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
                mView.showContent(forecastWeather.toString());
                List<DailyForecastBean> daily_forecast = forecastWeather.getDaily_forecast();
                for (DailyForecastBean dailyForecastBean : daily_forecast) {
                    Log.i("dzq", "dailyForecastBean:" + dailyForecastBean.toString());
                }
                Log.e("dzq", "onNext: " + daily_forecast.toString());
            }
        });

    }

    @Override
    public void getNowWeather(String cityIfo) {
        mRetrofitHelper.obtainNowWeather(cityIfo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<NowWeather>, Observable<NowWeather>>() {
                    @Override
                    public Observable<NowWeather> call(WeatherResponse<NowWeather> nowWeatherResponse) {
                        List<NowWeather> results = nowWeatherResponse.getResults();
                        return Observable.from(results);
                    }
                })
                .subscribe(new Observer<NowWeather>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(NowWeather nowWeather) {
                        mView.showContent(nowWeather.toString());
                    }
                });
    }

    @Override
    public void getHourlyWeather(String cityIfo) {
        mRetrofitHelper.obtainHourlyWeather(cityIfo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<HourlyWeather>, Observable<HourlyWeather>>() {
                    @Override
                    public Observable<HourlyWeather> call(WeatherResponse<HourlyWeather> hourlyWeatherResponse) {
                        List<HourlyWeather> results = hourlyWeatherResponse.getResults();
                        return  Observable.from(results);
                    }
                })
                .subscribe(new Observer<HourlyWeather>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(HourlyWeather hourlyWeather) {
                        mView.showContent(hourlyWeather.toString());
                    }
                });
    }

    @Override
    public void getLifeSuggestion(String cityIfo) {
        mRetrofitHelper.obtainLifeSuggestion(cityIfo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<LifeSuggestion>, Observable<LifeSuggestion>>() {
                    @Override
                    public Observable<LifeSuggestion> call(WeatherResponse<LifeSuggestion> lifeSuggestionResponse) {
                        List<LifeSuggestion> results = lifeSuggestionResponse.getResults();
                        return Observable.from(results);
                    }
                })
                .subscribe(new Observer<LifeSuggestion>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(LifeSuggestion lifeSuggestion) {
                        mView.showContent(lifeSuggestion.toString());
                    }
                });
    }

    @Override
    public void getDamageAlarm(String cityIfo) {
        mRetrofitHelper.obtainDamageAlarm(cityIfo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<DamageAlarm>, Observable<DamageAlarm>>() {
                    @Override
                    public Observable<DamageAlarm> call(WeatherResponse<DamageAlarm> damageAlarmResponse) {
                        List<DamageAlarm> results = damageAlarmResponse.getResults();
                        return Observable.from(results);
                    }
                })
                .subscribe(new Observer<DamageAlarm>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(DamageAlarm damageAlarm) {
                        mView.showContent(damageAlarm.toString());
                    }
                });
    }
}
