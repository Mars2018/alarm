package com.htsc.alarm.common.bean;

/**
 * Created by mars_wang on 2016/7/14.
 */
public class Result {
    private String mark;
    private String message;
    private String data;

    public Result(String mark, String message, String data) {
        this.mark = mark;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
