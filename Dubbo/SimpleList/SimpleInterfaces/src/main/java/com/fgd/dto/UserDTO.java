package com.fgd.dto;

import java.io.Serializable;

/**
 * @document: user info pack
 * @author: fgd
 * @date: 2022/4/16
 */
public class UserDTO implements Serializable {

    /**
     * user name
     */
    private String name;

    /**
     * user age
     */
    private Integer age;

    /**
     * user self introduction
     */
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}
