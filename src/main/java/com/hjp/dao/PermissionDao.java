package com.hjp.dao;

import com.hjp.po.Permission;
import com.hjp.po.Product;

import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-14:31
 */
public interface PermissionDao {
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
