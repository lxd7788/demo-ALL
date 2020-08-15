package com.lxd.APItoken;

import lombok.Data;

/**
 * @ClassName TokenInfo
 * @Author lxd
 * @Date 2020/6/27 12:53
 * @Description TODO
 */
@Data
public class TokenInfo {
    /** token类型: api:0 、user:1 */
    private Integer tokenType;

    /** App 信息 */
    private AppInfo appInfo;

    /** 用户其他数据 */
    private UserInfo userInfo;
}
