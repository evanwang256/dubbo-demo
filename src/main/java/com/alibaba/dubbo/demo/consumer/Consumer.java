package com.alibaba.dubbo.demo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangzhen318 on 2017/2/7.
 */
public class Consumer {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("consumer.xml");
        DemoService demoService = (DemoService) ac.getBean("demoService");
        System.out.println(demoService.sayHello("world"));
    }
}
