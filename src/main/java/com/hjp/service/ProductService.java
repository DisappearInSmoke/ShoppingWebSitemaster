package com.hjp.service;

import com.hjp.po.Product;

import javax.swing.*;
import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-23:57
 */
public interface ProductService {
    /**
     * 查询全部
     * @return
     */
    List<Product> findAll();

    /**
     * 模糊全部
     * @param productName
     * @return
     */
    List<Product> findLike(String productName);

    /**
     * 查询单个
     * @param productId
     * @return
     */
    Product findOne(int productId);

    /**
     * 添加
     * @param product
     * @return
     */
    int insert(Product product);

    /**
     * 修改
     * @param product
     * @return
     */
    int update(Product product);

    /**
     * 删除
     * @param productId
     * @return
     */
    int delete(int productId);
}
