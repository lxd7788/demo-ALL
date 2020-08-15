package com.lxd.controller;

import com.lxd.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @ClassName ValidationController
 * @Author lxd
 * @Date 2020/6/4 21:53
 * @Description 参数校验demo
 */
@RestController
@RequestMapping("/valida")
public class ValidationController {

    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {
        //全局异常处理需要单独编写异常处理类
        //com\lxd\errConfig\ExceptionControllerAdvice.java
        return "success";
    }

}
