package com.lxd.service.impl;

import com.lxd.service.DemoTestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoTestServiceImpl
 * @Author lxd
 * @Date 2020/6/6 22:42
 * @Description TODO
 */
@Service
public class DemoTestServiceImpl implements DemoTestService {
    @Override
    public void demoTest(String name) {
        System.out.println(name);
    }
}
