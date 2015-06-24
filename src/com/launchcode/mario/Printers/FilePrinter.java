package com.launchcode.mario.Printers;

import com.launchcode.mario.Printer;

import javax.swing.*;
import java.io.*;

/**
 * Created by Ryan on 6/10/2015.
 */
public class FilePrinter implements Printer {

    public FilePrinter() {

        File file = new File("mario.txt");
        try (BufferedWriter output = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));) {
            output.write(StepBuilder());
        } catch (java.io.IOException e) {
            System.out.println("There was an error:" + e.getMessage());
        }
    }

    @Override
    public String StepBuilder() {
        StringBuilder steps = new StringBuilder();

        // Retrieve number of steps
        int numSteps = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of steps"));

        int spaces = numSteps - 1;
        int hashes = 2;

        // Loop to create steps
        for (int i = 0; i < numSteps; i++) {
            for (int j = 0; j < spaces; j++) {
                steps.append(" ");
            }
            for (int k = 0; k < hashes; k++) {
                steps.append("#");
            }
            steps.append("\n");
            hashes++;
            spaces--;
        }

        return steps.toString();
    }
}
