package com.hjp.po.order;

import com.hjp.po.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 烟消云散
 * @create 2019-11-22:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    /**
     * 订单编号
     */
    private int orderId;
    /**
     * 下单时间
     */
    private int orderNum;
    /**
     * 下单时间
     */
    private int orderTime;
    /**
     * 订单总金额
     */
    private String orderPrice;
    /**
     * 商品数量
     */
    private String orderProductSum;
    /**
     * 商品编号
     */
    private Product productId;
    /**
     * 收货地址编号
     */
    private Address addressId;
}

