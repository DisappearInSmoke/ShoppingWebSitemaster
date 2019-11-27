package com.hjp.dao;

import com.hjp.po.ConsumerPermission;
import com.hjp.po.Status;

import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-14:35
 */
public interface ConsumerPermissionDao {
    /**
     * 查询全部
     * @return
     */
    List<ConsumerPermission> findAll();

    /**
     * 查询单个
     * @param consumerPermissionId
     * @return
     */
    ConsumerPermission findOne(int consumerPermissionId);

    /**
     * 添加
     * @param consumerPermission
     * @return
     */
    int insert(ConsumerPermission consumerPermission);

    /**
     * 修改
     * @param consumerPermission
     * @return
     */
    int update(ConsumerPermission consumerPermission);

    /**
     * 删除
     * @param consumerPermissionId
     * @return
     */
    int delete(int consumerPermissionId);
}
