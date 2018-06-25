package com.cherry.order.repository;

import com.cherry.order.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/22 下午9:48
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
