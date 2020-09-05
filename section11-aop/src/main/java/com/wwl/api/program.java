package com.wwl.api;

import com.wwl.api.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class program {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        IUserService userService =(IUserService) context.getBean("userService");
        userService.add();
    }
}
