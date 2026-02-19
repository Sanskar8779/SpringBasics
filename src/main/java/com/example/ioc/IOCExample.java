package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIOCLooseCoupling.xml");

        UserManager userManagerWithDb = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDb.getUserInfo());

        UserManager userManagerWithWeb = (UserManager) context.getBean("userManagerWithWebDataProvider");
        System.out.println(userManagerWithWeb.getUserInfo());
    }
}
