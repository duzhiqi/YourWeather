package com.dzq.yourweather.model.bean.alarm;

import com.dzq.yourweather.model.bean.BasicBean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class DamageAlarm {

    /**
     * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.319000","lon":"120.165000","update":{"loc":"2016-11-25 18:51","utc":"2016-11-25 10:51"}}
     * status : ok
     */

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
