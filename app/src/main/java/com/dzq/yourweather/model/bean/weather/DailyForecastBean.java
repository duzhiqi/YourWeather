package com.dzq.yourweather.model.bean.weather;

import com.dzq.yourweather.model.bean.AstroBean;
import com.dzq.yourweather.model.bean.CondBean;
import com.dzq.yourweather.model.bean.TmpBean;
import com.dzq.yourweather.model.bean.WindBean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class DailyForecastBean {
    /**
     * 7-10天天气预报
     * astro : {"mr":"02:34","ms":"14:40","sr":"06:33","ss":"16:59"}
     * cond : {"code_d":"300","code_n":"305","txt_d":"阵雨","txt_n":"小雨"}
     * date : 2016-11-25 预报日期
     * hum : 77 相对湿度（%）
     * pcpn : 0.3 降水量（mm）
     * pop : 93 降水概率
     * pres : 1026 气压
     * tmp : {"max":"9","min":"7"} 气温
     * uv : 2
     * vis : 10 能见度（km）
     * wind : {"deg":"82","dir":"北风","sc":"微风","spd":"3"}
     */

    private AstroBean astro;
    private CondBean cond;
    private String date;
    private String hum;
    private String pcpn;
    private String pop;
    private String pres;
    private TmpBean tmp;
    private String uv;
    private String vis;
    private WindBean wind;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public TmpBean getTmp() {
        return tmp;
    }

    public void setTmp(TmpBean tmp) {
        this.tmp = tmp;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public WindBean getWind() {
        return wind;
    }

    public void setWind(WindBean wind) {
        this.wind = wind;
    }

}
