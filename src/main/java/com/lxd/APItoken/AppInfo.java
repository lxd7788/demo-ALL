package com.lxd.APItoken;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName AppInfo
 * @Author lxd
 * @Date 2020/6/27 12:53
 * @Description TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppInfo {
    /** App id */
    private String appId;
    /** API 秘钥 */
    private String key;
}
