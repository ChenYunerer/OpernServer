package com.yun.opern.utils;

import java.math.BigDecimal;

/**
 * 数据精确处理工具类（用于小数点情况提供精确计算）
 *
 * @author GQL
 */
public class BigDecimalUtil {

    /**
     * 加法
     *
     * @param value1 被加数
     * @param value2 加数
     * @return 两个参数的和
     */
    public static double add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(value1 + "");
        BigDecimal b2 = new BigDecimal(value2 + "");
        return b1.add(b2).doubleValue();
    }

    /**
     * 减法
     *
     * @param value1 被减数
     * @param value2 减数
     * @return 两个参数的差
     */
    public static double sub(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(value1 + "");
        BigDecimal b2 = new BigDecimal(value2 + "");
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 乘法
     *
     * @param value1 被乘数
     * @param value2 乘数
     * @return 两个参数的积
     */
    public static String mul2(String value1, String value2) {
        BigDecimal b1 = new BigDecimal(value1);
        BigDecimal b2 = new BigDecimal(value2);
        return b1.multiply(b2).toString();
    }

    /**
     * 乘法
     *
     * @param value1 被乘数
     * @param value2 乘数
     * @return 两个参数的积
     */
    public static double mul(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(value1 + "");
        BigDecimal b2 = new BigDecimal(value2 + "");
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 除法
     *
     * @param value1 被除数
     * @param value2 除数
     * @param scale  保留小数位数
     * @return 两个参数的商（保留X位小数,最后一位已执行向下取值）
     */
    public static String div(double value1, double value2, int scale) {
        if (value2 == 0) {
            return "";
        }

        BigDecimal b1 = new BigDecimal(value1 + "");
        BigDecimal b2 = new BigDecimal(value2 + "");
        return b1.divide(b2, scale, BigDecimal.ROUND_DOWN).toString();
    }


}
