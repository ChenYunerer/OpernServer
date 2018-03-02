package com.yun.opern.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * 将数字工具类
 *
 * @author gql
 */
public class NumberUtil {

    /**
     * 创建X位随机数
     *
     * @param digitNumber 要创建的随机数位数
     * @return 生成的数字字符串
     */
    public static String createNumberStr(int digitNumber) {
        // 生成随机类
        Random random = new Random();
        String sRand = "";
        for (int i = 0; i < digitNumber; i++) {
            String rand = String.valueOf(random.nextInt(10));
            sRand += rand;
        }
        return sRand;
    }

    /**
     * 将数字转换成时间格式显示
     *
     * @param time 数字
     * @return 返回时间格式字符串
     */
    public static String NumberToTime(int time) {
        String timeStr = null;
        int hour = 0;
        int minute = 0;
        int second = 0;
        if (time <= 0)
            return "00:00:00";
        else {
            minute = time / 60;
            if (minute < 60) {
                second = time % 60;
                timeStr = "00:" + unitFormat(minute) + ":" + unitFormat(second);
            } else {
                hour = minute / 60;
                if (hour > 99)
                    return "99:59:59";
                minute = minute % 60;
                second = time - hour * 3600 - minute * 60;
                timeStr = unitFormat(hour) + ":" + unitFormat(minute) + ":" + unitFormat(second);
            }
        }
        return timeStr;
    }

    /**
     * 位数前补0
     *
     * @param i
     * @return
     */
    private static String unitFormat(int i) {
        String retStr = null;
        if (i >= 0 && i < 10)
            retStr = "0" + Integer.toString(i);
        else
            retStr = "" + i;
        return retStr;
    }

    /**
     * double精度（直接截取，不舍入）
     *
     * @param doubleValue 要处理的值
     * @param accuracy    保留的小数点位数
     * @return 返回精度的double
     */
    public static double doubleFormat(double doubleValue, int accuracy) {
        BigDecimal bigDecimal = new BigDecimal(doubleValue + "");
        BigDecimal resultValue = bigDecimal.setScale(accuracy, BigDecimal.ROUND_DOWN);
        return Double.valueOf(resultValue.toString());
    }

    /**
     * double补位（小数点后不足4位补0）
     *
     * @param doubleValue 要处理的值
     * @return 返回补位后的字符串
     */
    public static String doubleFillStr(double doubleValue) {
        doubleValue = doubleFormat(doubleValue, 4);
        return new DecimalFormat("#,##0.0000").format(doubleValue);
    }

}
