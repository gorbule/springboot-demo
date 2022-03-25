package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //load Spring Configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean(s) from String Container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach aphaCoach = context.getBean("myCoach", Coach.class);

    }
}
