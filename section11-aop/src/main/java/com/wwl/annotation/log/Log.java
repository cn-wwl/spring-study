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
        System.out.println("方法执行前");
    }


    @After("execution(* com.wwl.annotation.service.*.*(..))")
    public void after()
    {
        System.out.println("方法执行后");
    }

    /**
     * 在环绕增强中,我们可以给定一个参数,代表我们要获取处理的切入点:
     * */
    @Around("execution(* com.wwl.annotation.service.*.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        Signature signature = jp.getSignature();
        System.out.println("签名:"+signature.getName());
        Object proceed=jp.proceed();

        System.out.println("环绕后");


    }
}
