package com.yun.opern.utils;

import java.util.Map;
import java.util.TreeMap;

/**
 * 通信传输加密工具类
 *
 * @author LinkinStar
 */
public class CorrespondEncryptUtil {

    /**
     * 对传输的信息进行加密
     *
     * @param map 传输信息的TreeMap
     * @param key 私钥
     * @return 加密后的字符串
     */
    public static String encrypt(TreeMap<String, String> map, String key) {
        StringBuilder resultKey = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (StringUtil.isNotNull(entry.getValue())) {
                resultKey.append(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        resultKey.append(key);
        return MD5Util.md5Str(resultKey.toString());
    }
}
