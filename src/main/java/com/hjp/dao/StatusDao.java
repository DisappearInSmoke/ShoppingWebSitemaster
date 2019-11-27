package com.hjp.dao;

import com.hjp.po.Product;
import com.hjp.po.Status;

import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-23:54
 */
public interface StatusDao {
    /**
     * 查询全部
     * @return
     */
    List<Status> findAll();

    /**
     * 查询单个
     * @param statusId
     * @return
     */
    Status findOne(int statusId);

    /**
     * 添加
     * @param status
     * @return
     */
    int insert(Status status);

    /**
     * 修改
     * @param status
     * @return
     */
    int update(Status status);

    /**
     * 删除
     * @param statusId
     * @return
     */
    int delete(int statusId);
}
