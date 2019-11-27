package com.hjp.dao;

import com.hjp.po.Consumer;
import com.hjp.po.Product;

import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-14:33
 */
public interface ConsumerDao {
    /**
     * 查询全部
     * @return
     */
    List<Consumer> findAll();
    /**
     * 查询单个
     * @param consumerId
     * @return
     */
    Consumer findOne(int consumerId);

    /**
     * 添加
     * @param consumer
     * @return
     */
    int insert(Consumer consumer);

    /**
     * 修改
     * @param consumer
     * @return
     */
    int update(Consumer consumer);

    /**
     * 删除
     * @param consumerId
     * @return
     */
    int delete(int consumerId);
}
