package com.hjp.service;

import com.hjp.po.Permission;

import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-14:58
 */
public interface PermissionService {
    /**
     * 查询全部
     * @return
     */
    List<Permission> findAll();
    /**
     * 查询单个
     * @param permissionId
     * @return
     */
    Permission findOne(int permissionId);
}
