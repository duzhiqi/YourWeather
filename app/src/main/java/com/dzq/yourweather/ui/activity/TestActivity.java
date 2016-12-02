package com.dzq.yourweather.ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dzq.yourweather.R;
import com.dzq.yourweather.presenter.BasePresenter;
import com.dzq.yourweather.presenter.impl.TestPresenterImpl;
import com.dzq.yourweather.ui.ITestView;

import butterknife.BindView;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class TestActivity<T extends BasePresenter> extends BaseActivity implements ITestView {

    @BindView(R.id.weekly_weather)
    Button weeklyWeather;
    @BindView(R.id.now_weather)
    Button nowWeather;
    @BindView(R.id.hourly_weather)
    Button hourlyWeather;
    @BindView(R.id.life_suggestion)
    Button lifeSuggestion;
    @BindView(R.id.damage_alarm)
    Button damageAlarm;
    @BindView(R.id.search_city)
    Button searchCity;
    @BindView(R.id.scene_weather)
    Button sceneWeather;
    @BindView(R.id.all_weather)
    Button allWeather;
    @BindView(R.id.cityInfo)
    EditText cityInfo;
    @BindView(R.id.weekly_weather_content)
    TextView weeklyWeatherContent;

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
        mPresenter = new TestPresenterImpl(TestActivity.this);
        weeklyWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getWeeklyWeather(getCityInfo());
            }
        });
        nowWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.getNowWeather(getCityInfo());
            }
        });
        hourlyWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.getHourlyWeather(getCityInfo());
            }
        });
        lifeSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.getLifeSuggestion(getCityInfo());
            }
        });
        damageAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.getDamageAlarm(getCityInfo());
            }
        });
        searchCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.searchCity(getCityInfo());
            }
        });
        sceneWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.getSceneWeather(getCityInfo());
            }
        });
        allWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.getAllWeather(getCityInfo());
            }
        });
    }

    @Override
    public void showContent(String content) {
        weeklyWeatherContent.setText(content);
    }

    @Override
    public String getCityInfo() {
        return cityInfo.getText().toString().trim();
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
