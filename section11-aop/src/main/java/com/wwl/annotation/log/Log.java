package com.wwl.annotation.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log  {

    @Before("execution(* com.wwl.annotation.service.*.*(..))")
    public void before()
    {
        System.out.println("����ִ��ǰ");
    }


    @After("execution(* com.wwl.annotation.service.*.*(..))")
    public void after()
    {
        System.out.println("����ִ�к�");
    }

    /**
     * �ڻ�����ǿ��,���ǿ��Ը���һ������,��������Ҫ��ȡ����������:
     * */
    @Around("execution(* com.wwl.annotation.service.*.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("����ǰ");

        Signature signature = jp.getSignature();
        System.out.println("ǩ��:"+signature.getName());
        Object proceed=jp.proceed();

        System.out.println("���ƺ�");


    }
}
