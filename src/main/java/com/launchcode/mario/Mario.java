package com.launchcode.mario;

import com.launchcode.mario.Printers.ConsolePrinter;
import com.launchcode.mario.Printers.FilePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

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

    public Mario (PyramidFactory factory) {  }

}
