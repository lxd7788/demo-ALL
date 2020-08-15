package com.lxd.APItoken;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName AccessToken
 * @Author lxd
 * @Date 2020/6/27 12:52
 * @Description TODO
 */
@Data
@AllArgsConstructor
public class AccessToken {
    /** token */
    private String token;

    /** 失效时间 */
    private Date expireTime;
}