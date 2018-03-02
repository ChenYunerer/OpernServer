package com.yun.opern.utils;

import java.util.UUID;

/**
 * 生成唯一标示符
 *
 * @author XEX
 */
public class UUIDutil {

    public static String createUUID() {
        // 创建 GUID 对象
        UUID uuid = UUID.randomUUID();
        // 得到对象产生的ID
        String a = uuid.toString();
        // 转换为大写
        a = a.toUpperCase();
        // 替换 -
        // a = a.replaceAll("-", "");
        return a;
    }
}
