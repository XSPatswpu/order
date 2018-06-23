package com.cherry.order.controller;


import com.cherry.order.dto.OrderMasterDTO;
import com.cherry.order.service.OrderService;
import com.cherry.product.pojos.ResponseJson;
import com.cherry.product.pojos.ResponseJsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/16 下午4:24
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 订单服务流程：
     * 1.校验参数
     * 2.查询商品信息（调用商品服务）
     * 3.计算总价
     * 4.扣库存（调用商品服务）
     * 5.订单入库
     */
    @PostMapping("/create")
    public ResponseJson create(@Valid @RequestBody OrderMasterDTO orderDTO){
        log.info("/order/create:{}",orderDTO);

        String orderId = orderService.createOrder(orderDTO);
        return ResponseJsonBuilder.createSuccess(orderId);
    }
}
