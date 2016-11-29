package com.dzq.yourweather.model.bean.domain;

import com.dzq.yourweather.model.bean.AlarmsBean;
import com.dzq.yourweather.model.bean.BasicBean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class DamageAlarm {
    private BasicBean basic;
    private AlarmsBean alarms;
    private String status;

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public AlarmsBean getAlarms() {
        return alarms;
    }

    public void setAlarms(AlarmsBean alarms) {
        this.alarms = alarms;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DamageAlarm{" +
                "basic=" + basic +
                ", alarms=" + alarms +
                ", status='" + status + '\'' +
                '}';
    }
}
