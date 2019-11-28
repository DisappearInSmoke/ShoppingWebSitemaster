package com.hjp.service;

import com.hjp.dao.PermissionDao;
import com.hjp.po.Permission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-15:01
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionDao pd;

    public List<Permission> findAll() {
        return pd.findAll();
    }

    public Permission findOne(int permissionId) {
        return pd.findOne(permissionId);
    }
}
