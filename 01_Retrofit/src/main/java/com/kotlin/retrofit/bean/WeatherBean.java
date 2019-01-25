package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Created by dell on 2018/6/14.
 */
public class WeatherBean {


    /**
     * code : 10000
     * weathers : [{"date":"1月21日","weather":"晴","temperature":"-4℃/8℃","wind":"北风小于3级","picture1":"http://127.0.0.1:8080/images/weather/0.gif","picture2":"http://127.0.0.1:8080/images/weather/0.gif","picture3":"http://127.0.0.1:8080/images/weather/0.gif"},{"date":"1月22日","weather":"晴","temperature":"-3℃/10℃","wind":"北风转东北风小于3级","picture1":"http://127.0.0.1:8080/images/weather/0.gif","picture2":"http://127.0.0.1:8080/images/weather/0.gif","picture3":"http://127.0.0.1:8080/images/weather/0.gif"},{"date":"1月23日","weather":"晴","temperature":"-5℃/7℃","wind":"东北风转北风小于3级","picture1":"http://127.0.0.1:8080/images/weather/0.gif","picture2":"http://127.0.0.1:8080/images/weather/0.gif","picture3":"http://127.0.0.1:8080/images/weather/0.gif"},{"date":"1月24日","weather":"晴转多云","temperature":"-5℃/4℃","wind":"北风转东北风小于3级","picture1":"http://127.0.0.1:8080/images/weather/0.gif","picture2":"http://127.0.0.1:8080/images/weather/1.gif","picture3":"http://127.0.0.1:8080/images/weather/0.gif"},{"date":"1月25日","weather":"多云转晴","temperature":"-7℃/4℃","wind":"东北风转西风小于3级","picture1":"http://127.0.0.1:8080/images/weather/1.gif","picture2":"http://127.0.0.1:8080/images/weather/0.gif","picture3":"http://127.0.0.1:8080/images/weather/1.gif"}]
     * todayWeather : [{"currentTemperature":"-1℃","weather":"晴","temperature":"-4℃/8℃","place":"北京","time":"2019/01/21 22:11:53","air":"中","day":"星期一","bigPicture":"http://127.0.0.1:8080/images/weather/b0.gif","picture":"http://127.0.0.1:8080/images/weather/0.gif","wind":"西风 1级"}]
     * weatherIndex : [{"index":"紫外线指数","indexValue":"中等"},{"index":"健臻·血糖指数","indexValue":"不易波动"},{"index":"穿衣指数","indexValue":"较冷"},{"index":"洗车指数","indexValue":"较适宜"},{"index":"空气污染指数","indexValue":"中"}]
     * errorMsg : 读取天气成功
     */

    private int code;
    private String errorMsg;
    private List<WeathersBean> weathers;
    private List<TodayWeatherBean> todayWeather;
    private List<WeatherIndexBean> weatherIndex;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<WeathersBean> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<WeathersBean> weathers) {
        this.weathers = weathers;
    }

    public List<TodayWeatherBean> getTodayWeather() {
        return todayWeather;
    }

    public void setTodayWeather(List<TodayWeatherBean> todayWeather) {
        this.todayWeather = todayWeather;
    }

    public List<WeatherIndexBean> getWeatherIndex() {
        return weatherIndex;
    }

    public void setWeatherIndex(List<WeatherIndexBean> weatherIndex) {
        this.weatherIndex = weatherIndex;
    }

    public static class WeathersBean {
        /**
         * date : 1月21日
         * weather : 晴
         * temperature : -4℃/8℃
         * wind : 北风小于3级
         * picture1 : http://127.0.0.1:8080/images/weather/0.gif
         * picture2 : http://127.0.0.1:8080/images/weather/0.gif
         * picture3 : http://127.0.0.1:8080/images/weather/0.gif
         */

        private String date;
        private String weather;
        private String temperature;
        private String wind;
        private String picture1;
        private String picture2;
        private String picture3;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }

        public String getPicture1() {
            return picture1;
        }

        public void setPicture1(String picture1) {
            this.picture1 = picture1;
        }

        public String getPicture2() {
            return picture2;
        }

        public void setPicture2(String picture2) {
            this.picture2 = picture2;
        }

        public String getPicture3() {
            return picture3;
        }

        public void setPicture3(String picture3) {
            this.picture3 = picture3;
        }
    }

    public static class TodayWeatherBean {
        /**
         * currentTemperature : -1℃
         * weather : 晴
         * temperature : -4℃/8℃
         * place : 北京
         * time : 2019/01/21 22:11:53
         * air : 中
         * day : 星期一
         * bigPicture : http://127.0.0.1:8080/images/weather/b0.gif
         * picture : http://127.0.0.1:8080/images/weather/0.gif
         * wind : 西风 1级
         */

        private String currentTemperature;
        private String weather;
        private String temperature;
        private String place;
        private String time;
        private String air;
        private String day;
        private String bigPicture;
        private String picture;
        private String wind;

        public String getCurrentTemperature() {
            return currentTemperature;
        }

        public void setCurrentTemperature(String currentTemperature) {
            this.currentTemperature = currentTemperature;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getAir() {
            return air;
        }

        public void setAir(String air) {
            this.air = air;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getBigPicture() {
            return bigPicture;
        }

        public void setBigPicture(String bigPicture) {
            this.bigPicture = bigPicture;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }
    }

    public static class WeatherIndexBean {
        /**
         * index : 紫外线指数
         * indexValue : 中等
         */

        private String index;
        private String indexValue;

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getIndexValue() {
            return indexValue;
        }

        public void setIndexValue(String indexValue) {
            this.indexValue = indexValue;
        }
    }
}
