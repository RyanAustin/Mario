package com.launchcode.mario;

import com.launchcode.mario.Printers.ConsolePrinter;
import com.launchcode.mario.Printers.FilePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * User: Ryan
 * Date: 6/24/2015
 * Time: 11:48 AM
 */
public class PyramidFactory {

    public PyramidFactory (Pyramid pyramid) {
        String[] options = new String[]{"Console", "File"};

        int printChoice = JOptionPane.showOptionDialog(null, "Do you want to print to the console or a file?", "Print Location",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);

        if (printChoice == 0) {
            new ConsolePrinter().Print(pyramid);
        } else if (printChoice == 1) {
            new FilePrinter().Print(pyramid);
        }
    }
}
