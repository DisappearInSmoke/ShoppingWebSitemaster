package com.hjp.dao.order;

import com.hjp.po.order.Address;
import com.hjp.po.order.Order;

import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-22:58
 */
public interface AddressDao {
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
