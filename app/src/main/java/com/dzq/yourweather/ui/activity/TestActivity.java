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
        mPresenter = new TestPresenterImpl(TestActivity.this);
//
        weeklyWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("dzq", "getData");
                mPresenter.getWeeklyWeather(cityInfo.getText().toString().trim());
//                getMovie();
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


    //进行网络请求
//    private void getMovie(){
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(Config.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        WeatherApis weatherApiServices = retrofit.create(WeatherApis.class);
//        Call<JsonObj> result = weatherApiServices.getSearch("hangzhou", Config.MY_WEATHER_KEY);
//        result.enqueue(new Callback<JsonObj>() {
//            @Override
//            public void onResponse(Call<JsonObj> call, Response<JsonObj> response) {
//                Log.i("dzq", "response:" + response.toString() );
//
//                if (response.isSuccessful()) {
////                    WeatherResult body = response.body();
//                    JsonObj body = response.body();
//                    Log.e("dzq", "body:" + body.toString() );
//                    List<JsonObj.HeWeather5Bean> heWeather5 = body.getHeWeather5();
//                    JsonObj.HeWeather5Bean heWeather5Bean = heWeather5.get(0);
//                    JsonObj.HeWeather5Bean.BasicBean basic = heWeather5Bean.getBasic();
//                    Log.e("dzq", "city:" + basic.getCity());
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JsonObj> call, Throwable t) {
//                Log.e("dzq", "error:" + t.getMessage());
//            }
//        });
//    }

}
