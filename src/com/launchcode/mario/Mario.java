package com.launchcode.mario;

import com.launchcode.mario.Printers.ConsolePrinter;
import com.launchcode.mario.Printers.FilePrinter;

import javax.swing.*;

/**
 * Created by Ryan on 6/10/2015.
 */
public class Mario {


    public static void main(String[] args) {
        String[] options = new String[] {"Console", "File"};

        int printChoice = JOptionPane.showOptionDialog(null, "Do you want to print to the console or a file?", "Print Location",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);

        if (printChoice == 0) {
            ConsolePrinter console = new ConsolePrinter();
        } else if (printChoice == 1) {
            FilePrinter file = new FilePrinter();
        }
    }
}
