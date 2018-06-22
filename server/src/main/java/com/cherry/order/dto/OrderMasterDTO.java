package com.cherry.order.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/21 下午2:12
 */
@Data
public class OrderMasterDTO {
    @NotEmpty(message = "客户姓名必填")
    private String name;//客户姓名
    @NotEmpty(message = "客户电话必填")
    private String phone;//客户电话
    @NotEmpty(message = "客户地址必填")
    private String address;//客户地址
    @NotEmpty(message = "客户openid必填")
    private String openid;//客户openid
    private List<OrderDetailDTO> items;//订单详情
}
