package com.dao;

public class user {

    public  user(String name)
    {
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Show()
    {
        System.out.println("name:"+name);
    }
}
