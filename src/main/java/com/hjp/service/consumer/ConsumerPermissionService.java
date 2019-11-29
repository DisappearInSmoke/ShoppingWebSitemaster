package com.hjp.service.consumer;

import com.hjp.po.consumer.ConsumerPermission;

import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-14:59
 */
public interface ConsumerPermissionService {
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
