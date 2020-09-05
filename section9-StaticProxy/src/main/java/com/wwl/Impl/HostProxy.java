package com.wwl.Impl;

import com.wwl.Interfaces.IRent;

public class HostProxy implements IRent {

    private  Host host;

    public HostProxy(Host host)
    {
        this.host=host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
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
