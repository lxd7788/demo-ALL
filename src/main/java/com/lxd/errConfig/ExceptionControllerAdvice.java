package com.lxd.errConfig;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName ExceptionControllerAdvice
 * @Author lxd
 * @Date 2020/6/4 22:02
 * @Description 全局异常处理类
 * 参考：https://blog.csdn.net/weixin_42002747/article/details/105480795
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        return new ResultVO<>(ResultCode.VALIDATE_FAILED, objectError.getDefaultMessage());
    }

    @ExceptionHandler(APIException.class)
    public ResultVO<String>  APIExceptionHandler(APIException e) {
        return new ResultVO<>(ResultCode.FAILED, e.getMsg());
    }


}
