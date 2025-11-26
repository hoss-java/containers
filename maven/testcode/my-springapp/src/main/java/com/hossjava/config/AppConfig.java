package com.nexttop.config;

import com.nexttop.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Employee employee() {
        return new Employee("Honest Employee");
    }
}