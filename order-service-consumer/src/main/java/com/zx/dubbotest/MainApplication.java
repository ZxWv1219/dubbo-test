package com.zx.dubbotest;

import com.zx.dubbotest.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zx
 * @date 2020/11/23 16:06
 * @modified By:
 */
public class MainApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = ioc.getBean(OrderService.class);

        orderService.initOrder("1");

        System.out.println("调用完成...");
        System.in.read();
    }
}
