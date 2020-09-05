package com.wwl.config;


import com.wwl.pojo.Company;
import com.wwl.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Springconfig2.class)
public class SpringConfig {

    @Bean
    public Company getCompany()
    {
        return new Company();

    }

}
