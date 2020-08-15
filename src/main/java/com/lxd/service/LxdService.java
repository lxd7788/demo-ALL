package com.lxd.service;

import com.lxd.pojo.LxdDemo;

public interface LxdService {

    void addData(LxdDemo lxdDemo);
    LxdDemo selectByName(String name);
}
