package com.lxd;

import com.lxd.service.DemoTestService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName DemoTest
 * @Author lxd
 * @Date 2020/6/6 22:38
 * @Description TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LxdDemoServiceApplication.class) //主类参数不加也行，加与不加差异如何未知
public class DemoTest {

    @Autowired
    private DemoTestService demoTestService;

    @Test
    public void tt(){
        demoTestService.demoTest("hjkshdkjhaskj");
    }

    @Test
    public void t1(){
        System.out.println(1111);
    }
}
