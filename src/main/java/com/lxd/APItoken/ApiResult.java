package com.lxd.APItoken;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ApiResult
 * @Author lxd
 * @Date 2020/6/27 12:55
 * @Description TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult {

    /** 代码 */
    private String code;

    /** 结果 */
    private String msg;
}
