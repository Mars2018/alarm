package com.htsc.alarm.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by mars_wang on 2016/7/14.
 */
public class DateUtils {

    private static Logger LOG = LoggerFactory.getLogger(DateUtils.class);

    /**
     * 将日期转化为星期
     * @param dateString 日期字符串，格式为"yyyy-mm-dd"
     * @return 返回1是星期日、2是星期一、3是星期二、4是星期三、5是星期四、6是星期五、7是星期六
     */
    public static int getDayOfWeek(String dateString){
        if(dateString.trim().equals("") || dateString == null)
            LOG.error("dateString 为空！");
        Date date = new Date(getDateByStr(dateString).getTime());
        LOG.debug("date:[]", date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }


    /**
     * 日期转化为星期
     * @param date 日期，格式“yyyy-mm-dd”
     * @return 返回1是星期日、2是星期一、3是星期二、4是星期三、5是星期四、6是星期五、7是星期六
     */
    public static int getDayOfWeek(Date date){
        if(date == null)
            LOG.error("date 为空！");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    private static Date getDateByStr(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            LOG.error("星期转化出错:[]", e);
        }
        return date;
    }
}
