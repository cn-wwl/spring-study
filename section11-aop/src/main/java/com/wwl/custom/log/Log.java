package com.wwl.custom.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class Log  {

    public void before()
    {
        System.out.println("����ִ��ǰ");
    }

    public void after()
    {
        System.out.println("����ִ�к�");
    }
}
