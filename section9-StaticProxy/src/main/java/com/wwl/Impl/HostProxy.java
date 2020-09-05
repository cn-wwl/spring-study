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
