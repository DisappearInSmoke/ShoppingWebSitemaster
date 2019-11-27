package com.hjp.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 烟消云散
 * @create 2019-11-13:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consumer {

    /**
     * 编号
     */
    private int consumerId;
    /**
     * 用户名
     */
    private String consumerUserName;
    /**
     * 用户密码
     */
    private String consumerPassword;
    /**
     * 权限
     */
    private Permission permission;
}
