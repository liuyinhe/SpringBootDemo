package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 *
 * @author liuyinhe
 * @date 2018/2/2
 */
@Controller
public class FreemarkerController {
    @RequestMapping("/demo")
    public String demo(Map<String, Object> map) {
        map.put("descrip", "It's a springboot integrate freemarker's demo!!!!");
        return "demo";
    }

}
