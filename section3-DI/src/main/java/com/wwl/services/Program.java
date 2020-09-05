package com.wwl.services;

import com.wwl.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {



        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student.toString());

    }
}
