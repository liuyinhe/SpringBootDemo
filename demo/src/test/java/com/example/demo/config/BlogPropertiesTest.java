package com.example.demo.config;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by liuyinhe on 2018/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class BlogPropertiesTest {
    @Resource
    private BlogProperties myBlogProperties;

    @Test
    public void testSelfProp() throws Exception {
        System.out.println("在配置中获得的固定配置属性：" + myBlogProperties.getName());
        System.out.println("在配置中获得的随机配置属性：" + myBlogProperties.getBignumber());

    }

}