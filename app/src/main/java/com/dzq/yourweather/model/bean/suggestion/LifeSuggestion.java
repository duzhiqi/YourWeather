package com.dzq.yourweather.model.bean.suggestion;

import com.dzq.yourweather.model.bean.BasicBean;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class LifeSuggestion {


    /**
     * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.319000","lon":"120.165000","update":{"loc":"2016-11-25 18:12","utc":"2016-11-25 10:12"}}
     * status : ok
     * suggestion : {"air":{"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},"comf":{"brf":"较舒适","txt":"白天会有降雨，这种天气条件下，人们会感到有些凉意，但大部分人完全可以接受。"},"cw":{"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},"drsg":{"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},"flu":{"brf":"易发","txt":"天冷空气湿度大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。"},"sport":{"brf":"较不宜","txt":"有降水，推荐您在室内进行各种健身休闲运动，若坚持户外运动，须注意保暖并携带雨具。"},"trav":{"brf":"适宜","txt":"有降水，稍凉，微风细语，很是浪漫，适宜旅游，可不要错过机会呦！但记得出门要携带雨具。"},"uv":{"brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}}
     */

    private BasicBean basic;
    private String status;
    private SuggestionBean suggestion;

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

    public SuggestionBean getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionBean suggestion) {
        this.suggestion = suggestion;
    }


    public static class SuggestionBean {
        /**
         * air : {"brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}
         * comf : {"brf":"较舒适","txt":"白天会有降雨，这种天气条件下，人们会感到有些凉意，但大部分人完全可以接受。"}
         * cw : {"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"}
         * drsg : {"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"}
         * flu : {"brf":"易发","txt":"天冷空气湿度大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。"}
         * sport : {"brf":"较不宜","txt":"有降水，推荐您在室内进行各种健身休闲运动，若坚持户外运动，须注意保暖并携带雨具。"}
         * trav : {"brf":"适宜","txt":"有降水，稍凉，微风细语，很是浪漫，适宜旅游，可不要错过机会呦！但记得出门要携带雨具。"}
         * uv : {"brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}
         */

        private AirBean air;
        private ComfBean comf;
        private CwBean cw;
        private DrsgBean drsg;
        private FluBean flu;
        private SportBean sport;
        private TravBean trav;
        private UvBean uv;

        public AirBean getAir() {
            return air;
        }

        public void setAir(AirBean air) {
            this.air = air;
        }

        public ComfBean getComf() {
            return comf;
        }

        public void setComf(ComfBean comf) {
            this.comf = comf;
        }

        public CwBean getCw() {
            return cw;
        }

        public void setCw(CwBean cw) {
            this.cw = cw;
        }

        public DrsgBean getDrsg() {
            return drsg;
        }

        public void setDrsg(DrsgBean drsg) {
            this.drsg = drsg;
        }

        public FluBean getFlu() {
            return flu;
        }

        public void setFlu(FluBean flu) {
            this.flu = flu;
        }

        public SportBean getSport() {
            return sport;
        }

        public void setSport(SportBean sport) {
            this.sport = sport;
        }

        public TravBean getTrav() {
            return trav;
        }

        public void setTrav(TravBean trav) {
            this.trav = trav;
        }

        public UvBean getUv() {
            return uv;
        }

        public void setUv(UvBean uv) {
            this.uv = uv;
        }

    }

}
