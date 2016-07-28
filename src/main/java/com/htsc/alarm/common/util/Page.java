package com.htsc.alarm.common.util;

/**
 * Created by mars_wang on 2016/7/28.
 */
public class Page {

    private Integer startRow=0;//开始位置
    private Integer endRow=0;//结束位置
    private Integer pageNo=0;//第几页
    private Integer records = 8;


    public Integer getPageNo() {
        return pageNo;
    }
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
    public Integer getStartRow() {
        return startRow;
    }
    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }
    public Integer getEndRow() {
        return endRow;
    }
    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }

    public Integer getRecords() {
        return records;
    }

    public void setRecords(Integer records) {
        this.records = records;
    }
}
