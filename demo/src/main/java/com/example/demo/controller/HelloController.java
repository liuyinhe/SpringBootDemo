package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author liuyinhe
 * @date 2018/2/1
 */
@RestController
@RequestMapping("api/hello")
public class HelloController {
    @RequestMapping("hello")
    public String testHelloWorld() {
        return "hello world";
    }
}
