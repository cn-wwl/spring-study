package com.wwl;

import com.wwl.Impl.Host;
import com.wwl.Impl.HostProxy;

public class program {
    public static void main(String[] args) {
        HostProxy poxy=new HostProxy(new Host());
        poxy.rent();
    }

}
