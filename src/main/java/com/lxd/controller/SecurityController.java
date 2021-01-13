package com.lxd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SecurityController
 * @Author lxd
 * @Date 2020/6/6 14:56
 * @Description securityDemo
 */
@RestController
public class SecurityController {
    @GetMapping("/hello")
    public String hello() {
        return "llljkjkjklll";
    }

    @RequestMapping("/f1")
    public String f1() {
        return "f1";
    }
    @RequestMapping("/f2")
    public String f2() {
        return "f2";
    }
}
