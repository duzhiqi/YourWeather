package com.dzq.yourweather.ui.activity;

import android.app.Activity;
import android.os.Bundle;

import com.dzq.yourweather.presenter.BasePersenter;
import com.dzq.yourweather.ui.BaseView;

import butterknife.ButterKnife;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public abstract class BaseActivity extends Activity implements BaseView {

    protected Activity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        mContext = this;

        initData();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        getMyPresenter().detachView();
    }

    protected abstract int getLayout();
    protected abstract BasePersenter getMyPresenter();
    protected abstract void initData();
}
