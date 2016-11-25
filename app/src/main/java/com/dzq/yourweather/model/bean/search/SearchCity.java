package com.dzq.yourweather.model.bean.search;

import com.dzq.yourweather.model.bean.BasicBean;

/**
 * Description:通过此接口获取城市信息，例如通过名称获取城市ID，建议使用城市ID获取天气数据，避免重名城市导致的混淆
 * Created by dzq on 2016/11/25.
 */

public class SearchCity {

    /**
     * basic : {"city":"北京","cnty":"中国","id":"CN101010100","lat":"39.904000","lon":"116.391000","prov":"直辖市"}
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
