package com.dzq.yourweather.util;

import android.util.Log;

import com.dzq.yourweather.config.Config;

/**
 * Description: Log Wrapper
 * Created by dzq on 2016/11/25.
 */

public class SLog {

    public static void e(String tag, String msg){
        if (Config.isDebug){
            Log.e(tag, msg);
        }
    }

    public static void d(String tag, String msg){
        if (Config.isDebug){
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg){
        if (Config.isDebug){
            Log.i(tag, msg);
        }
    }

}
