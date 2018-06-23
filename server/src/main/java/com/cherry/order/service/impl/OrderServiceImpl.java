package com.cherry.order.service.impl;

import com.cherry.order.dto.OrderDetailDTO;
import com.cherry.order.dto.OrderMasterDTO;
import com.cherry.order.entity.OrderMaster;
import com.cherry.order.enums.OrderEnum;
import com.cherry.order.enums.PayEnum;
import com.cherry.order.repository.OrderMasterRepository;
import com.cherry.order.service.OrderService;
import com.cherry.order.utils.CherryUtil;
import com.cherry.product.client.ProductClient;
import com.cherry.product.dto.DecreaseStockDTO;
import com.cherry.product.dto.ProductInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/22 下午1:11
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private ProductClient productClient;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public String createOrder(OrderMasterDTO orderDTO) {

        List<String> productIds = orderDTO.getItems().stream()
                .map(OrderDetailDTO::getProductId).collect(Collectors.toList());
        //1.查询商品信息（调用商品服务）
        List<ProductInfoDTO> products = productClient.findProduct(productIds);

        //2.计算总价格
        BigDecimal totalPrice = BigDecimal.ZERO;
        List<OrderDetailDTO> orderDetailList = orderDTO.getItems();

        for (OrderDetailDTO orderDetailDTO : orderDetailList) {
            for (ProductInfoDTO product : products) {
                if(orderDetailDTO.getProductId().equals(product.getProductId())){
                    totalPrice = totalPrice.add(product.getProductPrice().multiply(new BigDecimal(orderDetailDTO.getProductQuantity())));
                }
            }
        }

        log.info("购买的商品总价：{}",totalPrice);

        //3.扣库存
        List<ProductInfoDTO> productInfoDTOList = productClient.decreaseStockForOrder(orderDetailList.stream()
                .map(e -> new DecreaseStockDTO(e.getProductId(),e.getProductQuantity())).collect(Collectors.toList()));
        //4.订单入库
        //insert OrderMaster
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId(CherryUtil.generateUUID());
        orderMaster.setBuyerName(orderDTO.getName());
        orderMaster.setBuyerPhone(orderDTO.getPhone());
        orderMaster.setBuyerAddress(orderDTO.getAddress());
        orderMaster.setBuyerOpenid(orderDTO.getOpenid());
        orderMaster.setOrderAmount(totalPrice);
        orderMaster.setOrderStatus(OrderEnum.NEW.getCode());
        orderMaster.setPayStatus(PayEnum.WAIT.getCode());
        orderMasterRepository.save(orderMaster);
        //insert OrderDetail TODO
        return orderMaster.getOrderId();
    }
}
