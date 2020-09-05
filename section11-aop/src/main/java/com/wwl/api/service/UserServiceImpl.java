package com.wwl.api.service;

public class UserServiceImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void put() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void get() {
        System.out.println("查询了一个用户");
    }
}
