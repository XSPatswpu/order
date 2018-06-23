package com.cherry.order.enums;

import lombok.Getter;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/22 下午10:07
 */
@Getter
public enum OrderEnum {
    NEW(0,"新订单"),
    FINISHED(1,"已完结"),
    CANCEL(2,"取消");

    private Integer code;
    private String msg;
    OrderEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
