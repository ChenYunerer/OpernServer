package com.yun.opern.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换
 *
 * @author gql
 */
public class DateUtil {

    /**
     * 时间字符串格式：yyyy-MM-dd HH:mm:ss.SSS
     */
    public static final String dateFormat1 = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * 时间字符串格式：yyyy-MM-dd HH:mm:ss
     */
    public static final String dateFormat2 = "yyyy-MM-dd HH:mm:ss";

    /**
     * 时间字符串格式：yyyy-MM-dd HH:mm
     */
    public static final String dateFormat3 = "yyyy-MM-dd HH:mm";

    /**
     * 时间字符串格式：yyyy-MM-dd
     */
    public static final String dateFormat4 = "yyyy-MM-dd";

    /**
     * 时间字符串格式：HH:mm:ss
     */
    public static final String dateFormat5 = "HH:mm:ss";

    /**
     * 时间字符串格式：yyyyMMddHHmmss
     */
    public static final String dateFormat6 = "yyyyMMddHHmmss";

    /**
     * 时间字符串格式：yyyyMMddHHmm
     */
    public static final String dateFormat7 = "yyyyMMddHHmm";

    /**
     * 时间字符串格式：yyMMddHHmmss
     */
    public static final String dateFormat8 = "yyMMddHHmmss";

    /**
     * 时间字符串格式：yyMMddHHmm
     */
    public static final String dateFormat9 = "yyMMddHHmm";

    /**
     * 时间字符串格式：yyMMdd
     */
    public static final String dateFormat10 = "yyMMdd";

    /**
     * 时间字符串格式：yyyyMMdd
     */
    public static final String dateFormat11 = "yyyyMMdd";

    /**
     * 获取当前时间的时间戳毫秒数
     * 推荐此种方法，执行速度快
     *
     * @return 时间毫秒数
     */
    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    /**
     * 获取当前时间的时间戳
     * 推荐此种方法，执行速度快
     *
     * @return 时间戳
     */
    public static Timestamp getCurrentTime() {
        return new Timestamp(System.currentTimeMillis());
    }

    /**
     * 获取当天凌晨的时间戳毫秒数
     *
     * @return 时间毫秒数
     */
    public static long lingchenLong() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        String dataStr = formatter.format(date);

        long dateLong = 0;
        try {
            Date newDate = formatter.parse(dataStr);
            dateLong = newDate.getTime();
        } catch (ParseException e) {
            LogUtil.printErrorLog(e);
        }

        return dateLong;
    }

    /**
     * 将时间字符串转换时间格式
     *
     * @param timeStr 时间字符串
     * @return 时间戳
     */
    public static Timestamp stringToTimestamp(String timeStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(timeStr);
            Timestamp timestamp = new Timestamp(date.getTime());
            return timestamp;
        } catch (ParseException e) {
            LogUtil.printErrorLog(e);
        }

        return null;
    }

    /**
     * 将时间戳毫秒数转换字符串
     *
     * @param timeLong   时间戳毫秒数
     * @param dateFormat 时间字符串格式，如：yyyy-MM-dd HH:mm:ss.SSS
     * @return 时间字符串格式的文本
     */
    public static String longToTimeStr(long timeLong, String dateFormat) {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        Date date = new Date(timeLong);
        String timeStr = formatter.format(date);

        return timeStr;
    }

    /**
     * 将时间字符串转换成时间戳毫秒数
     *
     * @param timeStr 时间字符串，格式：yyyy-MM-dd HH:mm:ss
     * @return 时间戳毫秒数
     */
    public static long timeStrToLong(String timeStr) {
        if (StringUtil.isNotNull(timeStr)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            Date date = null;
            try {
                date = sdf.parse(timeStr);
                long timeL = date.getTime();
                return timeL;
            } catch (ParseException e) {
                LogUtil.printErrorLog(e);
            }
        }

        return 0;
    }

    /**
     * 将时间戳毫秒数转换时间戳格式
     *
     * @param timeLong 时间戳毫秒数
     * @return 时间戳
     */
    public static Timestamp longToTimestamp(long timeLong) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = new Date(timeLong);
        String dataStr = formatter.format(date);
        Timestamp timestamp = Timestamp.valueOf(dataStr);

        return timestamp;
    }

}
