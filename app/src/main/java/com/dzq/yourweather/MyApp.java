package com.dzq.yourweather;


import android.app.Application;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class MyApp extends Application {

    public static MyApp myApp;

    public static MyApp getInstance(){
        return myApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
    }
}
