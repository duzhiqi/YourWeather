package com.dzq.yourweather.presenter.impl;

import com.dzq.yourweather.presenter.BasePersenter;
import com.dzq.yourweather.ui.BaseView;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Description: 控制rx生命周期
 * Created by dzq on 2016/11/25.
 */

public class BasePersenterImpl<T extends BaseView> implements BasePersenter<T> {

    protected T mView;
    protected CompositeSubscription mCompositeSubscription;

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
        unSubscribe();
    }

    protected void addSubscribe(Subscription s) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(s);
    }


    protected void unSubscribe() {
        if (mCompositeSubscription != null) {
            mCompositeSubscription.unsubscribe();
        }
    }
}
