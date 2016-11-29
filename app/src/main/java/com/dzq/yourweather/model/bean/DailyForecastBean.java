package com.dzq.yourweather.model.bean;

import com.dzq.yourweather.model.bean.AstroBean;
import com.dzq.yourweather.model.bean.CondBean;
import com.dzq.yourweather.model.bean.TmpBean;
import com.dzq.yourweather.model.bean.WindBean;

/**
 * Description: 七天预报
 * Created by duzhiqi on 2016/11/29.
 */

public class DailyForecastBean {
    private String date;//预报日期
    private String hum;//相对湿度
    private String pcpn;//降水量
    private String pop;//降水概率
    private String pres;//气压
    private String vis;//能见度
    private AstroBean astro;//天文指数
    private CondBean cond;//天气状况
    private TmpBean tmp;//温度
    private WindBean wind;//风力
    private String status;//接口状态

    private String uv;//?????

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getPcpn() {
        return pcpn;
    }

    public void setPcpn(String pcpn) {
        this.pcpn = pcpn;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getPres() {
        return pres;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AstroBean getAstro() {
        return astro;
    }

    public void setAstro(AstroBean astro) {
        this.astro = astro;
    }

    public CondBean getCond() {
        return cond;
    }

    public void setCond(CondBean cond) {
        this.cond = cond;
    }

    public TmpBean getTmp() {
        return tmp;
    }

    public void setTmp(TmpBean tmp) {
        this.tmp = tmp;
    }

    public WindBean getWind() {
        return wind;
    }

    public void setWind(WindBean wind) {
        this.wind = wind;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DailyForecastBean{" +
                "date='" + date + '\'' +
                ", hum='" + hum + '\'' +
                ", pcpn='" + pcpn + '\'' +
                ", pop='" + pop + '\'' +
                ", pres='" + pres + '\'' +
                ", vis='" + vis + '\'' +
                ", astro=" + astro +
                ", cond=" + cond +
                ", tmp=" + tmp +
                ", wind=" + wind +
                ", status='" + status + '\'' +
                ", uv='" + uv + '\'' +
                '}';
    }
}
