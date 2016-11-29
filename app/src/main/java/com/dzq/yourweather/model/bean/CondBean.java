package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class CondBean {
    //天气状况，天气状况代码和图标
//    "code_d": "101",  //白天天气状况代码
//    "code_n": "101",  //夜间天气状况代码
//    "txt_d": "多云",  //白天天气状况描述
//    "txt_n": "多云" //夜间天气状况描述

    private String code_d;
    private String code_n;
    private String txt_d;
    private String txt_n;

    public String getCode_d() {
        return code_d;
    }

    public void setCode_d(String code_d) {
        this.code_d = code_d;
    }

    public String getCode_n() {
        return code_n;
    }

    public void setCode_n(String code_n) {
        this.code_n = code_n;
    }

    public String getTxt_d() {
        return txt_d;
    }

    public void setTxt_d(String txt_d) {
        this.txt_d = txt_d;
    }

    public String getTxt_n() {
        return txt_n;
    }

    public void setTxt_n(String txt_n) {
        this.txt_n = txt_n;
    }

    @Override
    public String toString() {
        return "CondBean{" +
                "code_d='" + code_d + '\'' +
                ", code_n='" + code_n + '\'' +
                ", txt_d='" + txt_d + '\'' +
                ", txt_n='" + txt_n + '\'' +
                '}';
    }
}
