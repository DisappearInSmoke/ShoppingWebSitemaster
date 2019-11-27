package com.hjp.service;

import com.hjp.dao.StatusDao;
import com.hjp.po.Status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-0:03
 */
@Service
public class StatusServiceImpl implements StatusService {
    @Resource
    private StatusDao sd;

    public List<Status> findAll() {
        return sd.findAll();
    }

    public Status findOne(int statusId) {
        return sd.findOne(statusId);
    }

    public int insert(Status status) {
        return sd.insert(status);
    }

    public int update(Status status) {
        return sd.update(status);
    }

    public int delete(int statusId) {
        return sd.delete(statusId);
    }
}
