package com.wwl;

import com.wwl.Impl.Host;
import com.wwl.Impl.ProxyInvocationHandler;
import com.wwl.Interfaces.IRent;

public class program {

    public static void main(String[] args) {

        Host host=new Host();
        ProxyInvocationHandler proxy=new ProxyInvocationHandler();
        proxy.setTarget(host);
        IRent rent= (IRent)proxy.getProxy();
        rent.rent();
    }
}
