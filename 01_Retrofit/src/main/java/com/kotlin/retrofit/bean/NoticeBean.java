package com.kotlin.retrofit.bean;

/**
 * Created by dell on 2018/5/30.
 */
public class NoticeBean {


    private String  breakdown;
    private  String reason;
    private String time;
    public NoticeBean(String breakdown, String reason, String time) {
        this.breakdown = breakdown;
        this.reason = reason;
        this.time = time;
    }

    public String getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(String breakdown) {
        this.breakdown = breakdown;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "NoticeBean{" +
                "breakdown='" + breakdown + '\'' +
                ", reason='" + reason + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
