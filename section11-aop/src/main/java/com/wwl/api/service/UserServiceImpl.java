package com.wwl.api.service;

public class UserServiceImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("������һ���û�");
    }

    @Override
    public void delete() {
        System.out.println("ɾ����һ���û�");
    }

    @Override
    public void put() {
        System.out.println("�޸���һ���û�");
    }

    @Override
    public void get() {
        System.out.println("��ѯ��һ���û�");
    }
}
