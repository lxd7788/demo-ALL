package com.lxd.controller;

import com.lxd.pojo.LxdDemo;
import com.lxd.service.LxdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lxd")
public class LxdController {

    private static Logger logger = LoggerFactory.getLogger(LxdController.class);
    @Autowired
    private LxdService service;

    @PostMapping("/add")
    public void add(@RequestParam(value = "name", required=false)String name,@RequestParam(value = "id", required=false)String id){

        LxdDemo demo = new LxdDemo();
        demo.setName(name);
        demo.setId(id);
        service.addData(demo);
    }

    @PostMapping("/select")
    public ResponseEntity<LxdDemo> select(String name){
        LxdDemo lxdDemo = service.selectByName(name);
        return ResponseEntity.ok(lxdDemo);
    }
}
