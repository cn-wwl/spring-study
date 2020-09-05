package com.wwl.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class Company {
    @Value("∞¢¿Ô")
    private String name;
    public List<User> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
