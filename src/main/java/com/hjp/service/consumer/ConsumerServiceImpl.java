package com.hjp.service.consumer;

import com.hjp.dao.consumer.ConsumerDao;
import com.hjp.po.consumer.Consumer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-15:00
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Resource
    private ConsumerDao cd;

    public List<Consumer> findAll() {
        return cd.findAll();
    }

    public Consumer findOne(String consumerUserName, String consumerPassword) {
        return cd.findOne(consumerUserName,consumerPassword);
    }

    public int insert(Consumer consumer) {
        return cd.insert(consumer);
    }

    public int update(Consumer consumer) {
        return cd.update(consumer);
    }

    public int delete(int consumerId) {
        return cd.delete(consumerId);
    }
}
