package com.dzq.yourweather.ui.activity;

import android.widget.Button;
import android.widget.EditText;

import com.dzq.yourweather.R;
import com.dzq.yourweather.presenter.BasePersenter;
import com.dzq.yourweather.presenter.impl.TestPresenterImpl;
import com.dzq.yourweather.ui.ITestActivity;

import butterknife.BindView;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class TestActivity<T extends BasePersenter> extends BaseActivity implements ITestActivity {

    @BindView(R.id.weekly_weather)
    Button weeklyWeather;

    @BindView(R.id.cityInfo)
    EditText cityInfo;
    @BindView(R.id.weekly_weather_content)
    EditText weeklyWeatherContent;

    private TestPresenterImpl mPresenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_test;
    }

    @Override
    protected BasePersenter getMyPresenter() {
        return mPresenter;
    }


    @Override
    protected void initData() {
        mPresenter = new TestPresenterImpl(this);
        mPresenter.getWeeklyWeather(cityInfo.getText().toString().trim());
    }

    @Override
    public void showContent(String content) {
        weeklyWeatherContent.setText(content);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError() {

    }
}
