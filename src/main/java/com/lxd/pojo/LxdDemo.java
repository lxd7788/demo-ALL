package com.lxd.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lxd
 */
@Table(name="cs_demo")
public class LxdDemo {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
