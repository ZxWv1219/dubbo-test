package com.zx.dubbotest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zx
 * @date 2020/11/23 16:06
 * @modified By:
 */
public class MainApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        System.in.read();
    }
}
