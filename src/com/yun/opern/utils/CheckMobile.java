package com.yun.opern.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 检测是否为移动端设备访问
 */
public class CheckMobile {

    // \b 是单词边界(连着的两个(字母字符 与 非字母字符) 之间的逻辑上的间隔),    
    // 字符串在编译时会被转码一次,所以是 "\\b"    
    // \B 是单词内部逻辑间隔(连着的两个字母字符之间的逻辑上的间隔)    
    static final String phoneReg = "\\b(ip(hone|od)|android|opera m(ob|in)i"
            + "|windows (phone|ce)|blackberry"
            + "|s(ymbian|eries60|amsung)|p(laybook|alm|rofile/midp"
            + "|laystation portable)|nokia|fennec|htc[-_]"
            + "|mobile|up.browser|[1-4][0-9]{2}x[1-4][0-9]{2})\\b";
    static final String tableReg = "\\b(ipad|tablet|(Nexus 7)|up.browser"
            + "|[1-4][0-9]{2}x[1-4][0-9]{2})\\b";

    //移动设备正则匹配：手机端、平板  
    static final Pattern phonePat = Pattern.compile(phoneReg, Pattern.CASE_INSENSITIVE);
    static final Pattern tablePat = Pattern.compile(tableReg, Pattern.CASE_INSENSITIVE);

    /**
     * 检测是否是移动设备访问
     *
     * @param request 访问请求
     * @return true：移动设备接入，false：pc端接入
     */
    public static boolean check(HttpServletRequest request) {
        if (request == null) {
            return false;
        }
        HttpSession session = request.getSession();
        if (session == null) {
            return false;
        }

        boolean isFromMobile = false;
        //检查是否已经记录访问方式（移动端或pc端）
        if (null == session.getAttribute("ua")) {
            try {
                //获取ua，用来判断是否为移动端访问
                String userAgent = request.getHeader("USER-AGENT");
                if (!StringUtil.isNotNull(userAgent)) {
                    return false;
                }
                userAgent = userAgent.toLowerCase();

                //匹配
                Matcher matcherPhone = phonePat.matcher(userAgent);
                Matcher matcherTable = tablePat.matcher(userAgent);
                if (matcherPhone.find() || matcherTable.find()) {
                    isFromMobile = true;
                } else {
                    isFromMobile = false;
                }

                if (isFromMobile) {
                    session.setAttribute("ua", "mobile");
                } else {
                    session.setAttribute("ua", "pc");
                }
            } catch (Exception e) {
                LogUtil.printErrorLog(e);
            }

            return isFromMobile;
        } else {
            return session.getAttribute("ua").equals("mobile");
        }
    }

    /**
     * 是否是微信端访问
     *
     * @param request 访问请求
     * @return true：是微信端访问，false：不是微信端访问
     */
    public static boolean isWeixin(HttpServletRequest request) {
        if (request == null) {
            return false;
        }

        String userAgent = request.getHeader("USER-AGENT");
        if (!StringUtil.isNotNull(userAgent)) {
            return false;
        }
        userAgent = userAgent.toLowerCase();

        if (userAgent.contains("micromessenger")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 是否是支付宝端访问
     *
     * @param request 访问请求
     * @return true：是支付宝端访问，false：不是支付宝端访问
     */
    public static boolean isAlipay(HttpServletRequest request) {
        if (request == null) {
            return false;
        }

        String userAgent = request.getHeader("USER-AGENT");
        if (!StringUtil.isNotNull(userAgent)) {
            return false;
        }
        userAgent = userAgent.toLowerCase();

        if (userAgent.contains("alipayclient")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 是否是Android端访问
     *
     * @param request 访问请求
     * @return true：是Android端访问，false：不是Android端访问
     */
    public static boolean isAndroid(HttpServletRequest request) {
        if (request == null) {
            return false;
        }

        String userAgent = request.getHeader("USER-AGENT");
        if (!StringUtil.isNotNull(userAgent)) {
            return false;
        }
        userAgent = userAgent.toLowerCase();

        if (userAgent.contains("android")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 是否是IOS端访问
     *
     * @param request 访问请求
     * @return true：是IOS端访问，false：不是IOS端访问
     */
    public static boolean isIOS(HttpServletRequest request) {
        if (request == null) {
            return false;
        }

        String userAgent = request.getHeader("USER-AGENT");
        if (!StringUtil.isNotNull(userAgent)) {
            return false;
        }
        userAgent = userAgent.toLowerCase();

        if (userAgent.contains("iphone")) {
            return true;
        } else {
            return false;
        }
    }

}  