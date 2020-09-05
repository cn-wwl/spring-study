package com.wwl.Impl;

import com.wwl.Interfaces.IRent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler
{
    //���������
    private Object target;

    public void setTarget(Object target)
    {
        this.target=target;
    }

    //���ɵõ�������
    public Object getProxy()
    {
      return  Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    //��������ʵ���������ؽ��
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //����ı��ʣ�����ʹ�÷������ʵ�ֵ�
        Object result = method.invoke(target,args);
        fare();
        hetong();
        return result;
    }


    public void seeHouse()
    {
        System.out.println("ȥ����");
    }

    public void fare()
    {
        System.out.println("���н��");
    }


    public void hetong()
    {
        System.out.println("ǩ��ͬ");
    }
}
