package com.wwl.Impl;

import com.wwl.Interfaces.IRent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler
{
    //被代理的类
    private Object target;

    public void setTarget(Object target)
    {
        this.target=target;
    }

    //生成得到代理类
    public Object getProxy()
    {
      return  Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    //出来代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //代理的本质，就是使用反射机制实现的
        Object result = method.invoke(target,args);
        fare();
        hetong();
        return result;
    }


    public void seeHouse()
    {
        System.out.println("去看房");
    }

    public void fare()
    {
        System.out.println("收中介费");
    }


    public void hetong()
    {
        System.out.println("签合同");
    }
}
