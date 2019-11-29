package com.hjp.po.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 烟消云散
 * @create 2019-11-21:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    /**
     * 地址id
     */
    private int addressId;
    /**
     * 地址详细
     */
    private String addressName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 用户编号
     */
    private int consumerId;







}
