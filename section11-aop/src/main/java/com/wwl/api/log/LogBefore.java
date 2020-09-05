package com.wwl.api.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogBefore implements MethodBeforeAdvice {

    /**
     * method:Ҫִ�е�Ŀ����󷽷�
     * args������
     * target��Ŀ�����
     * */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "��" + method.getName() + "��ִ����");
    }
}
