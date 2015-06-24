package com.launchcode.mario;

import com.launchcode.mario.Stepbuilders.ConsoleBuilder;
import com.launchcode.mario.Stepbuilders.FileBuilder;

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
            ConsoleBuilder console = new ConsoleBuilder();
        } else if (printChoice == 1) {
            FileBuilder file = new FileBuilder();
        }
    }
}
