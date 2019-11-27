package com.hjp.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 烟消云散
 * @create 2019-11-14:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {
    /**
     * 权限编号
     */
    private int permissionId;
    /**
     * 权限名称
     */
    private String permissionName;
}
