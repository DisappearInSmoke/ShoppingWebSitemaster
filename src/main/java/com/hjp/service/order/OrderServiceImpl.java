package com.hjp.service.order;

import com.hjp.dao.order.OrderDao;
import com.hjp.po.order.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-1:24
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao od;

    public List<Order> findAll() {
        return od.findAll();
    }

    public Order findOne(int orderId) {
        return od.findOne(orderId);
    }

    public int insert(Order order) {
        return od.insert(order);
    }

    public int update(Order order) {
        return od.update(order);
    }

    public int delete(int orderId) {
        return od.delete(orderId);
    }
}
