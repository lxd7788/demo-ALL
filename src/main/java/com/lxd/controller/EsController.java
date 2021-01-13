package com.lxd.controller;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName EsController
 * @Author lxd
 * @Date 2021/1/13 22:01
 * @Description TODO
 */
@RestController
@RequestMapping("/es")
public class EsController {
    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @RequestMapping("demo")
    public void demo(){
        System.out.println(restHighLevelClient);
    }
}
