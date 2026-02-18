package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        FirstBean firstBean = (FirstBean) context.getBean("firstBean");
        System.out.println(firstBean);
    }
}
