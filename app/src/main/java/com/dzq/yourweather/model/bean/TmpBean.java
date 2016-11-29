package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class TmpBean {
    //温度
//    "max": "16",  //最高温度
//     "min": "10" //最低温度

    private String max;
    private String min;

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "TmpBean{" +
                "max='" + max + '\'' +
                ", min='" + min + '\'' +
                '}';
    }
}
