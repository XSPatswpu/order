package com.cherry.order.service;

import com.cherry.order.dto.OrderMasterDTO;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/22 下午1:06
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order 订单master
     * @return 订单号码
     */
    String createOrder(OrderMasterDTO order);
}
