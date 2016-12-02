package com.dzq.yourweather;

import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dzq.yourweather.config.Config;
import com.dzq.yourweather.model.bean.CondBean;
import com.dzq.yourweather.presenter.BasePresenter;
import com.dzq.yourweather.presenter.impl.MainPresenterImpl;
import com.dzq.yourweather.ui.IMainView;
import com.dzq.yourweather.ui.activity.BaseActivity;
import com.dzq.yourweather.util.ImageLoader;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements IMainView {

    @BindView(R.id.now_weather)
    TextView content;
    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout srl;
    @BindView(R.id.icon_weather)
    ImageView iconWeather;
    @BindView(R.id.clean)
    Button clean;
    @BindView(R.id.description_weather)
    TextView descriptionWeather;

    private MainPresenterImpl mainPresenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter getMyPresenter() {
        return mainPresenter;
    }

    @Override
    protected void initData() {

        mainPresenter = new MainPresenterImpl(this);
        mainPresenter.showNowWeather(getCityInfo());
        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mainPresenter.showNowWeather(getCityInfo());
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText("");
            }
        });

    }

    private String getCityInfo() {
        return "hangzhou";
    }

    @Override
    public void showProgress() {
        srl.setRefreshing(true);
    }

    @Override
    public void hideProgress() {
        srl.setRefreshing(false);
    }

    @Override
    public void showError() {

    }

    @Override
    public void showNowWeather(String nowWeatherInfo) {
        content.setText(nowWeatherInfo);
    }

    @Override
    public void setContent(CondBean cond){
        ImageLoader.loadImage(this, Config.WEATHER_ICON_URL + cond.getCode() + ".png", iconWeather);
        descriptionWeather.setText(cond.getTxt());
    }
}
