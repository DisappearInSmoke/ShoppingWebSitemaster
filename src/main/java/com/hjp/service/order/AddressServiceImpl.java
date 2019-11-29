package com.hjp.service.order;

import com.hjp.dao.order.AddressDao;
import com.hjp.po.order.Address;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-1:22
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressDao ad;

    public List<Address> findAll() {
        return ad.findAll();
    }

    public Address findOne(int addressId) {
        return ad.findOne(addressId);
    }

    public int insert(Address address) {
        return ad.insert(address);
    }

    public int update(Address address) {
        return ad.update(address);
    }

    public int delete(int addressId) {
        return ad.delete(addressId);
    }
}
