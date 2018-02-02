package com.lh.demo.entity;


import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class User implements Serializable {
    @ApiModelProperty(value = "用户ID")
    private Integer Id;
    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "用户年龄")
    private Integer age;
    @ApiModelProperty(value = "用户地址")
    private String address;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
