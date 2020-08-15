package com.lxd.errConfig;

import lombok.Getter;

/**
 * @ClassName APIException
 * @Author lxd
 * @Date 2020/6/4 22:10
 * @Description 自定义异常
 */
//lombok自动生成get方法
@Getter
public class APIException extends RuntimeException{
    private int code;
    private String msg;

    public APIException() {
        this(1001, "接口错误");
    }

    public APIException(String msg) {
        this(1001, msg);
    }

    public APIException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

}
