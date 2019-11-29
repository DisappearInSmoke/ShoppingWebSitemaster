package com.hjp.po.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author 烟消云散
 * @create 2019-11-14:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerPermission {
    /**
     * 编号
     */
    private int consumerPermissionId;
    /**
     * 权限id
     */
    private Consumer consumerId;
    /**
     * 用户id
     */
    private Permission permissionId;

}
