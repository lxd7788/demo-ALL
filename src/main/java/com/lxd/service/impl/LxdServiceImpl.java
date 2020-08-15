package com.lxd.service.impl;

import com.lxd.mapper.LxdDemoMapper;
import com.lxd.pojo.LxdDemo;
import com.lxd.service.LxdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LxdServiceImpl implements LxdService {

    @Autowired
    private LxdDemoMapper mapper;
    @Override
    public void addData(LxdDemo lxdDemo) {
        mapper.insert(lxdDemo);
    }

    @Override
    public LxdDemo selectByName(String name) {

        return mapper.selectByName(name);
    }
}
