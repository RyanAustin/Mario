package com.launchcode.mario;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Ryan
 * Date: 6/10/2015
 * Time: 10:58 AM
 */
public class Mario {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        context.getBean("mario");
    }

    private PyramidFactory factory;

    public Mario (PyramidFactory factory) { this.factory = factory; }

}
