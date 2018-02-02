package com.example.demo.dto;

import java.io.Serializable;

/**
 * @author liuyinhe
 * @date 2018/2/2
 */
public class User implements Serializable {
    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;

    }

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
