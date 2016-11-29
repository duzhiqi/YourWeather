package com.dzq.yourweather.model.bean.domain;

import com.dzq.yourweather.model.bean.BasicBean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class SearchCity {
    private BasicBean basic;
    private String status;

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
