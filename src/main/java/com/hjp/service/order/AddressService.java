package com.hjp.service.order;

import com.hjp.po.order.Address;

import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-1:21
 */
public interface AddressService {
    /**
     * 查询全部
     * @return
     */
    List<Address> findAll();

    /**
     *查询单个
     * @param addressId
     * @return
     */
    Address findOne(int addressId);

    /**
     * 添加
     * @param address
     * @return
     */
    int insert(Address address);

    /**
     * 修改
     * @param address
     * @return
     */
    int update(Address address);

    /**
     * 删除
     * @param addressId
     * @return
     */
    int delete(int addressId);
}
