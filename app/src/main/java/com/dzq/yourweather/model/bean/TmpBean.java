package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class TmpBean {
    /**
     * max : 9 //最高温度
     * min : 7 //最低温度
     */

    private String max;
    private String min;

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }
}
