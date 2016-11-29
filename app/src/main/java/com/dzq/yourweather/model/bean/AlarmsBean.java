package com.dzq.yourweather.model.bean;

/**
 * Description:
 * Created by duzhiqi on 2016/11/29.
 */

public class AlarmsBean {

//        "level": "蓝色",  //预警等级
//        "stat": "预警中",   //预警状态
//        "title": "天津市气象台发布大风蓝色预警",  //预警信息标题
//        "txt": "预计今天后半夜到明天夜间我区将受大风影响，平均风力达到6级，阵风7级以上。请有关单位和人员作好防范准备",  //预警信息详情
//        "type": "大风"  //预警天气类型

    private String level;
    private String stat;
    private String title;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String txt;
    private String type;
}
