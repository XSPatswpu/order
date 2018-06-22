package com.cherry.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/16 下午3:59
 */
@Data
@Entity
public class OrderMaster {
    @Id
    private String orderId;
    private String buyerName;//买家id
    private String buyerPhone;//买家电话
    private String buyerAddress;//买家地址
    private String buyerOpenid;//买家openId
    private BigDecimal orderAmount;//订单金额
    private Integer orderStatus;//订单状态
    private Integer payStatus;//支付状态
    private Date createTime;
    private Date updateTime;
}
