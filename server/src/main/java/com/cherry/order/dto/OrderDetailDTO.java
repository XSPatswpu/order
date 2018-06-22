package com.cherry.order.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/21 下午2:31
 */
@Data
public class OrderDetailDTO {
    @NotEmpty
    private String productId;//商品id
    @NotEmpty
    private String productQuantity;//购买的商品数量
}
