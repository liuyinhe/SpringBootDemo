package com.example.demo.controller;

import com.example.demo.dto.User;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author liuyinhe
 * @date 2018/2/2
 */
@RestController
@RequestMapping("/users")//通过这里配置使下面的映射都在/users下
public class UserController {
    /**
     * 创建线程安全的Map
     */
    static Map<Long, User> users = Maps.newConcurrentMap();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        //处理Users的Get请求,用来获取用户列表
        //还可以通过@RequestOaram从页面中传递参数来进行条件查询或者翻页信息查询传递
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user) {
        //处理post的请求，用来创建user
        //除了@ModelAttribute绑定参数之外也可以只有@RequestParam
        users.put(user.getId(), user);
        return "Success";


    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute User user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        User u =new User ();
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        return "success";
    }


}
