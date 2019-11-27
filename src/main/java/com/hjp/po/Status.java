package com.hjp.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 烟消云散
 * @create 2019-11-23:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {
    /**
     * 编号
     */
    private int statusId;
    /**
     * 状态
     */
    private String statusName;
}
