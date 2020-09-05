package com.wwl.services;


import com.wwl.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {

        ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());
        person.getCat().Call();
        person.getDog().Call();
    }
}
