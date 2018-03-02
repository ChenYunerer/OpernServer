package com.yun.opern.utils;

/**
 * 文件格式判定
 *
 * @author gql
 */
public class FileFomat {

    /**
     * 判断是否是图片
     *
     * @param fileName 图片名称
     * @return true：是图片，false：不是图片
     */
    public static boolean isImage(String fileName) {
        if (!StringUtil.isNotNull(fileName)) {
            return false;
        }

        try {
            int num = fileName.lastIndexOf(".");
            String suffixStr = fileName.substring(num + 1).toLowerCase();

            if (suffixStr.equals("bmp") || suffixStr.equals("png") || suffixStr.equals("jpg") || suffixStr.equals("jpeg")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            LogUtil.printErrorLog(e);
            return false;
        }
    }

}
