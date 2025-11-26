package com.hossjava;

import com.hossjava.beans.Employee;
import com.hossjava.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        applicationContext.scan("com.hossjava");

        var employeeBean = (Employee) applicationContext.getBean("employee");
        System.out.println("Employee Name: " + employeeBean.getName());

    }
}