package com.hjp.service;

import com.hjp.dao.ConsumerPermissionDao;
import com.hjp.po.ConsumerPermission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-15:03
 */
@Service
public class ConsumerPermissionServiceImpl implements ConsumerPermissionService {
    @Resource
    private ConsumerPermissionDao cpd;

    public List<ConsumerPermission> findAll() {
        return cpd.findAll();
    }

    public ConsumerPermission findOne(int consumerPermissionId) {
        return cpd.findOne(consumerPermissionId);
    }

    public int insert(ConsumerPermission consumerPermission) {
        return cpd.insert(consumerPermission);
    }

    public int update(ConsumerPermission consumerPermission) {
        return cpd.update(consumerPermission);
    }

    public int delete(int consumerPermissionId) {
        return cpd.delete(consumerPermissionId);
    }
}
