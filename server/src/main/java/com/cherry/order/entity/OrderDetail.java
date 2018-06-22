package com.cherry.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/16 下午4:09
 */
@Data
@Entity
public class OrderDetail {
    @Id
    private String detailId;
    private String orderId;//订单父节点id
    private String productId;//商品id
    private String productName;//商品名称
    private BigDecimal productPrice;//商品单价
    private Integer productQuantity;//购买数量
    private String productIcon;//商品图片url
    private Date createTime;
    private Date updateTime;
}
