package com.cherry.order.repository;

import com.cherry.order.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description:
 * Author: cherry
 * Date: Created in 2018/6/22 下午9:44
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
