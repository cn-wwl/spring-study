package com.wwl.Impl;

import com.wwl.Interfaces.IRent;

public class Host implements IRent {

    @Override
    public void rent() {
        System.out.println("出租房子了");
    }
}
