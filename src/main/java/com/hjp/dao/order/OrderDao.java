package com.hjp.dao.order;

import com.hjp.po.order.Order;

import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-22:53
 */
public interface OrderDao {
    /**
     * 查询全部
     * @return
     */
    List<Order> findAll();

    /**
     *查询单个
     * @param orderId
     * @return
     */
    Order findOne(int orderId);

    /**
     * 添加
     * @param order
     * @return
     */
    int insert(Order order);

    /**
     * 修改
     * @param order
     * @return
     */
    int update(Order order);

    /**
     * 删除
     * @param orderId
     * @return
     */
    int delete(int orderId);
}
