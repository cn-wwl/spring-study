package com.wwl.api.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {
    /**
     * returnValue:����ֵ
     * method:Ҫִ�е�Ŀ����󷽷�
     * args������
     * target��Ŀ�����
     * */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "��" + method.getName() + "��ִ���ˣ�����ֵΪ��"+returnValue);
    }
}
