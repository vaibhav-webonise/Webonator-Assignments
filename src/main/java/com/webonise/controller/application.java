package com.webonise.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class application {
    public static void main(String[] args){

    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:myBeans.xml");
        HelloWorld helloWorld=(HelloWorld)applicationContext.getBean("objectHello");
        String str=helloWorld.getMessage();
        System.out.println(str);

    }


}
