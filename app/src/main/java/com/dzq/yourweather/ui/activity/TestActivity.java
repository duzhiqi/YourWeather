package com.dzq.yourweather.ui.activity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dzq.yourweather.R;
import com.dzq.yourweather.presenter.BasePresenter;
import com.dzq.yourweather.presenter.impl.TestPresenterImpl;
import com.dzq.yourweather.ui.ITestActivity;

import butterknife.BindView;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class TestActivity<T extends BasePresenter> extends BaseActivity implements ITestActivity {

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
    protected BasePresenter getMyPresenter() {
        return mPresenter;
    }


    @Override
    protected void initData() {
        mPresenter = new TestPresenterImpl(this);

        weeklyWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("dzq", "getData");
                mPresenter.getWeeklyWeather(cityInfo.getText().toString().trim());
            }
        });

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
