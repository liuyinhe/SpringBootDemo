package com.example.demo.service.impl;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;

import static org.junit.Assert.*;

/**
 * Created by liuyinhe on 2018/2/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TaskTest {
    @Autowired
    private Task task;

    @Autowired
    private Task2 task2;
    @Test
    public void doTaskOne() throws Exception {
            task.doTaskOne();
            task.doTaskTwo();
            task.doTaskThree();
            Thread.sleep(1000*60L);
    }

    @Test
    public void test() throws Exception {

        long start = System.currentTimeMillis();

        Future<String> task1 = task2.doTaskOne();
        Future<String> task22 = task2.doTaskTwo();
        Future<String> task32 = task2.doTaskThree();

        while(true) {
            if(task1.isDone() && task22.isDone() && task32.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }

        long end = System.currentTimeMillis();

        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");

    }

}