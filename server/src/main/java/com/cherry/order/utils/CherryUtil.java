package com.cherry.order.utils;

import java.util.UUID;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/22 下午9:58
 */
public class CherryUtil {
    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
