package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/12/1.
 */

public class ResponseCode {
//    ok	数据正常
//    invalid key	错误的key
//    unknown city	未知或错误城市
//    no more requests	超过访问次数
//    param invalid	参数错误
//    vip over	付费账号过期
//    anr	无响应或超时
//    permission denied	无访问权限，如免费key强制获取付费数据或获取未购买的付费数据

    public static final String RESPONSE_OK = "ok";
    public static final String RESPONSE_ERROR_KEY = "invalid key";
    public static final String RESPONSE_UNKNOWN = "unknown city";
    public static final String RESPONSE_OUT_REQUESTS = "no more requests";
    public static final String RESPONSE_ERROR_PARAM = "param invalid";
    public static final String RESPONSE_OUT_DATE = "vip over";
    public static final String RESPONSE_NO_ANSWER = "anr";
    public static final String PERMISSION_DENIED = "permission denied";
}
