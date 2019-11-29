package com.hjp.po.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 烟消云散
 * @create 2019-11-23:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    /**
     * 编号
     */
    private int productId;
    /**
     * 名称
     */
    private String productName;
    /**
     * 库存
     */
    private int productSum;
    /**
     * 价格
     */
    private double productPrice;
    /**
     * 状态
     */
    private Status statusId;
}
