package com.dzq.yourweather.presenter.impl;

import android.util.Log;

import com.dzq.yourweather.model.bean.DailyForecastBean;
import com.dzq.yourweather.model.bean.domain.AllWeather;
import com.dzq.yourweather.model.bean.domain.DamageAlarm;
import com.dzq.yourweather.model.bean.domain.ForecastWeather;
import com.dzq.yourweather.model.bean.domain.HourlyWeather;
import com.dzq.yourweather.model.bean.domain.LifeSuggestion;
import com.dzq.yourweather.model.bean.domain.NowWeather;
import com.dzq.yourweather.model.bean.domain.SceneWeather;
import com.dzq.yourweather.model.bean.domain.SearchCity;
import com.dzq.yourweather.model.http.RetrofitHelper;
import com.dzq.yourweather.model.http.WeatherResponse;
import com.dzq.yourweather.presenter.ITestPresenter;
import com.dzq.yourweather.ui.ITestView;

import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class TestPresenterImpl extends BasePresenterImpl implements ITestPresenter{

    private RetrofitHelper mRetrofitHelper;
    private ITestView mView;

    public TestPresenterImpl(ITestView view){
        this.mRetrofitHelper = RetrofitHelper.getInstance();
        mView = view;
    }
    @Override
    public void getWeeklyWeather(final String cityInfo) {
        Subscription subscribe = mRetrofitHelper.obtainForecastWeather(cityInfo)
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
        addSubscribe(subscribe);

    }

    @Override
    public void getNowWeather(String cityIfo) {
        Subscription subscribe = mRetrofitHelper.obtainNowWeather(cityIfo)
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
        addSubscribe(subscribe);
    }

    @Override
    public void getHourlyWeather(String cityIfo) {
        Subscription subscribe = mRetrofitHelper.obtainHourlyWeather(cityIfo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<HourlyWeather>, Observable<HourlyWeather>>() {
                    @Override
                    public Observable<HourlyWeather> call(WeatherResponse<HourlyWeather> hourlyWeatherResponse) {
                        List<HourlyWeather> results = hourlyWeatherResponse.getResults();
                        return Observable.from(results);
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
        addSubscribe(subscribe);
    }

    @Override
    public void getLifeSuggestion(String cityIfo) {
        Subscription subscribe = mRetrofitHelper.obtainLifeSuggestion(cityIfo)
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
        addSubscribe(subscribe);
    }

    @Override
    public void getDamageAlarm(String cityIfo) {
        Subscription subscribe = mRetrofitHelper.obtainDamageAlarm(cityIfo)
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
        addSubscribe(subscribe);
    }

    @Override
    public void searchCity(String cityInfo) {
        Subscription subscribe = mRetrofitHelper.obtainSearchCity(cityInfo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<SearchCity>, Observable<SearchCity>>() {
                    @Override
                    public Observable<SearchCity> call(WeatherResponse<SearchCity> searchCityResponse) {
                        List<SearchCity> results = searchCityResponse.getResults();

                        return Observable.from(results);
                    }
                })
                .subscribe(new Observer<SearchCity>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(SearchCity searchCity) {
                        mView.showContent(searchCity.toString());
                    }
                });
        addSubscribe(subscribe);
    }

    @Override
    public void getSceneWeather(String cityInfo) {
        Subscription subscribe = mRetrofitHelper.obtainSceneWeather(cityInfo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<SceneWeather>, Observable<SceneWeather>>() {
                    @Override
                    public Observable<SceneWeather> call(WeatherResponse<SceneWeather> sceneWeatherResponse) {
                        List<SceneWeather> results = sceneWeatherResponse.getResults();
                        return Observable.from(results);
                    }
                })
                .subscribe(new Observer<SceneWeather>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(SceneWeather sceneWeather) {
                        mView.showContent(sceneWeather.toString());
                    }
                });
        addSubscribe(subscribe);
    }

    @Override
    public void getAllWeather(String cityInfo) {
        Subscription subscribe = mRetrofitHelper.obtainAllWeather(cityInfo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Func1<WeatherResponse<AllWeather>, Observable<AllWeather>>() {
                    @Override
                    public Observable<AllWeather> call(WeatherResponse<AllWeather> allWeatherResponse) {
                        List<AllWeather> results = allWeatherResponse.getResults();
                        return Observable.from(results);
                    }
                })
                .subscribe(new Observer<AllWeather>() {
                    @Override
                    public void onCompleted() {
                        Log.d("dzq", "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("dzq", "onError:" + e.toString());
                    }

                    @Override
                    public void onNext(AllWeather allWeather) {
                        Log.d("dzq", "onNext:" + allWeather);
                        mView.showContent(allWeather.toString());
                    }
                });
        addSubscribe(subscribe);
    }
}
