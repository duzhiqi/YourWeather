package com.dzq.yourweather.presenter.impl;

import com.dzq.yourweather.model.bean.weather.ForecastWeather;
import com.dzq.yourweather.model.http.RetrofitHelper;
import com.dzq.yourweather.model.http.WeatherResponse;
import com.dzq.yourweather.presenter.ITestPresenter;
import com.dzq.yourweather.ui.ITestActivity;
import com.dzq.yourweather.ui.activity.TestActivity;

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

public class TestPresenterImpl extends BasePersenterImpl implements ITestPresenter{

    private RetrofitHelper mRetrofitHelper;
    private ITestActivity mView;

    public TestPresenterImpl(TestActivity view){
        this.mRetrofitHelper = RetrofitHelper.getInstance();
        mView = view;
    }
    @Override
    public void getWeeklyWeather(String cityInfo) {
        mView.showProgress();
        mRetrofitHelper.obtainForecastWeather(cityInfo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<ForecastWeather>, Observable<ForecastWeather>>() {
                    @Override
                    public Observable<ForecastWeather> call(WeatherResponse<ForecastWeather> forecastWeatherWeatherResponse) {
                        List<ForecastWeather> results = forecastWeatherWeatherResponse.getResults();
                        return Observable.from(results);
                    }
                })
                .subscribe(new Observer<ForecastWeather>() {
                    @Override
                    public void onCompleted() {
                        mView.hideProgress();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError();
                    }

                    @Override
                    public void onNext(ForecastWeather forecastWeather) {
                        String s = forecastWeather.toString();
                        mView.showContent(s);
                    }
                });
    }
}
