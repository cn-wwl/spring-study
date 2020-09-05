package com.wwl.service;

import com.wwl.config.SpringConfig;
import com.wwl.pojo.Company;
import com.wwl.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class program {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());

        Company company = context.getBean("getCompany", Company.class);

       List<User> Users = new ArrayList<User>();
       Users.add(user);
       company.setUsers(Users);

        System.out.println(company);
    }
}
