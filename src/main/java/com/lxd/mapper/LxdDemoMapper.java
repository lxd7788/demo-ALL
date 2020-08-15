package com.lxd.mapper;


import com.lxd.pojo.LxdDemo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface LxdDemoMapper extends Mapper<LxdDemo> {

    /**
     * 子当以注解查询接口
     * @param name
     * @return
     */
    @Select("select * from cs_demo where name = #{name}")
    LxdDemo selectByName(String name);
}
