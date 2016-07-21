package com.htsc.alarm.common.bean;

/**
 * Created by mars_wang on 2016/7/14.
 */
public class Result <T> {
    private String mark;
    private String message;
    private long totalCount;
    private T data;
    private String  updateTime;

    public Result(String mark, String message, T data) {
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


}
