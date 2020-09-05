package com.wwl.config;

import com.wwl.pojo.User;
import org.springframework.context.annotation.Bean;

public class Springconfig2 {

    @Bean
    public User getUser()
    {
        return new User();
    }
}
