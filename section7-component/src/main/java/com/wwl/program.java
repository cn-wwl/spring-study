package com.wwl;

import com.wwl.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class program {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
