package com.yun.opern.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadUtil {
    /**
     * 读取文件内容
     *
     * @param file
     * @return
     */
    public static String readTxtFile(File file) {
        //读取文件
        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
