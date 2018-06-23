package com.cherry.order.enums;

import lombok.Getter;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/22 下午10:10
 */
@Getter
public enum PayEnum {
    WAIT(0,"待支付"),
    SUCCESS(1,"支付成功");

    private Integer code;
    private String msg;
    PayEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
