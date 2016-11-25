package com.dzq.yourweather.presenter;

import com.dzq.yourweather.ui.BaseView;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public interface BasePersenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
