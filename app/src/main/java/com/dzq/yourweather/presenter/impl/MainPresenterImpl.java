package com.dzq.yourweather.presenter.impl;

import com.dzq.yourweather.config.Config;
import com.dzq.yourweather.model.bean.CondBean;
import com.dzq.yourweather.model.bean.NowBean;
import com.dzq.yourweather.model.bean.domain.NowWeather;
import com.dzq.yourweather.model.http.RetrofitHelper;
import com.dzq.yourweather.model.http.WeatherResponse;
import com.dzq.yourweather.presenter.IMainPresenter;
import com.dzq.yourweather.ui.IMainView;

import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Description:
 * Created by duzhiqi on 2016/12/1.
 */

public class MainPresenterImpl extends BasePresenterImpl implements IMainPresenter {
    private IMainView mView;
    private RetrofitHelper mRetrofitHelper;

    public MainPresenterImpl(IMainView mView) {
        this.mRetrofitHelper = RetrofitHelper.getInstance();
        this.mView = mView;
    }


    @Override
    public void showNowWeather(String cityInfo) {
        mView.showProgress();
        mRetrofitHelper.obtainNowWeather(cityInfo)
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
                        mView.hideProgress();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError();
                    }

                    @Override
                    public void onNext(NowWeather nowWeather) {
                        mView.showNowWeather(nowWeather.toString());
                        NowBean now = nowWeather.getNow();
                        CondBean cond = now.getCond();
                        mView.setContent(cond);
                    }
                });
    }
}
