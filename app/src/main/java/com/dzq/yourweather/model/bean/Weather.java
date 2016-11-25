package com.dzq.yourweather.model.bean;

import com.dzq.yourweather.model.bean.suggestion.SuggestionBean;
import com.dzq.yourweather.model.bean.weather.DailyForecastBean;
import com.dzq.yourweather.model.bean.weather.HourlyForecastBean;

import java.util.List;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class Weather {

    /**
     * aqi : {"city":{"aqi":"91","co":"1","no2":"73","o3":"7","pm10":"89","pm25":"67","qlty":"良","so2":"13"}}
     * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.319000","lon":"120.165000","update":{"loc":"2016-11-25 18:51","utc":"2016-11-25 10:51"}}
     * daily_forecast : [{"astro":{"mr":"02:34","ms":"14:40","sr":"06:33","ss":"16:59"},"cond":{"code_d":"104","code_n":"305","txt_d":"阴","txt_n":"小雨"},"date":"2016-11-25","hum":"77","pcpn":"0.3","pop":"93","pres":"1026","tmp":{"max":"9","min":"6"},"uv":"2","vis":"10","wind":{"deg":"82","dir":"西北风","sc":"微风","spd":"0"}},{"astro":{"mr":"03:27","ms":"15:14","sr":"06:34","ss":"16:59"},"cond":{"code_d":"305","code_n":"101","txt_d":"小雨","txt_n":"多云"},"date":"2016-11-26","hum":"87","pcpn":"8.0","pop":"100","pres":"1026","tmp":{"max":"7","min":"4"},"uv":"2","vis":"10","wind":{"deg":"341","dir":"东北风","sc":"3-4","spd":"14"}},{"astro":{"mr":"04:18","ms":"15:49","sr":"06:35","ss":"16:58"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2016-11-27","hum":"70","pcpn":"0.0","pop":"0","pres":"1028","tmp":{"max":"12","min":"4"},"uv":"4","vis":"10","wind":{"deg":"2","dir":"东北风","sc":"微风","spd":"7"}},{"astro":{"mr":"05:10","ms":"16:25","sr":"06:36","ss":"16:58"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2016-11-28","hum":"74","pcpn":"0.1","pop":"0","pres":"1031","tmp":{"max":"13","min":"5"},"uv":"4","vis":"10","wind":{"deg":"64","dir":"东北风","sc":"微风","spd":"9"}},{"astro":{"mr":"06:02","ms":"17:05","sr":"06:36","ss":"16:58"},"cond":{"code_d":"104","code_n":"104","txt_d":"阴","txt_n":"阴"},"date":"2016-11-29","hum":"78","pcpn":"0.1","pop":"0","pres":"1031","tmp":{"max":"13","min":"6"},"uv":"4","vis":"10","wind":{"deg":"52","dir":"东北风","sc":"微风","spd":"9"}},{"astro":{"mr":"06:54","ms":"17:48","sr":"06:37","ss":"16:58"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-11-30","hum":"77","pcpn":"0.0","pop":"0","pres":"1031","tmp":{"max":"14","min":"6"},"uv":"-999","vis":"10","wind":{"deg":"360","dir":"北风","sc":"微风","spd":"0"}},{"astro":{"mr":"07:45","ms":"18:33","sr":"06:38","ss":"16:58"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-12-01","hum":"74","pcpn":"0.0","pop":"0","pres":"1032","tmp":{"max":"12","min":"6"},"uv":"-999","vis":"10","wind":{"deg":"8","dir":"北风","sc":"微风","spd":"10"}}]
     * hourly_forecast : [{"cond":{"code":"300","txt":"阵雨"},"date":"2016-11-25 19:00","hum":"83","pop":"39","pres":"1026","tmp":"8","wind":{"deg":"256","dir":"北风","sc":"微风","spd":"5"}},{"cond":{"code":"305","txt":"小雨"},"date":"2016-11-25 22:00","hum":"86","pop":"77","pres":"1026","tmp":"9","wind":{"deg":"339","dir":"西北风","sc":"微风","spd":"5"}}]
     * now : {"cond":{"code":"300","txt":"阵雨"},"fl":"7","hum":"96","pcpn":"0.2","pres":"1025","tmp":"6","vis":"2","wind":{"deg":"83","dir":"东南风","sc":"3-4","spd":"11"}}
     * status : ok
     * suggestion : {"air":{"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},"comf":{"brf":"较舒适","txt":"白天会有降雨，这种天气条件下，人们会感到有些凉意，但大部分人完全可以接受。"},"cw":{"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},"drsg":{"brf":"冷","txt":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"},"flu":{"brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},"sport":{"brf":"较不宜","txt":"有降水，且风力较强，较适宜在户内进行各种健身休闲运动；若坚持户外运动，请注意保暖。"},"trav":{"brf":"一般","txt":"天气稍凉，风稍大会加大些凉意，且预报有降水，旅游指数一般，外出旅游请注意防风保暖并携带雨具。"},"uv":{"brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}}
     */

    private AqiBean aqi;
    private BasicBean basic;
    private NowBean now;
    private String status;
    private SuggestionBean suggestion;
    private List<DailyForecastBean> daily_forecast;
    private List<HourlyForecastBean> hourly_forecast;

    public AqiBean getAqi() {
        return aqi;
    }

    public void setAqi(AqiBean aqi) {
        this.aqi = aqi;
    }

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SuggestionBean getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionBean suggestion) {
        this.suggestion = suggestion;
    }

    public List<DailyForecastBean> getDaily_forecast() {
        return daily_forecast;
    }

    public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
        this.daily_forecast = daily_forecast;
    }

    public List<HourlyForecastBean> getHourly_forecast() {
        return hourly_forecast;
    }

    public void setHourly_forecast(List<HourlyForecastBean> hourly_forecast) {
        this.hourly_forecast = hourly_forecast;
    }

    public static class AqiBean {
        /**
         * city : {"aqi":"91","co":"1","no2":"73","o3":"7","pm10":"89","pm25":"67","qlty":"良","so2":"13"}
         */

        private CityBean city;

        public CityBean getCity() {
            return city;
        }

        public void setCity(CityBean city) {
            this.city = city;
        }
    }

}
