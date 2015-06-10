package com.launchcode.mario;

import javax.swing.*;

/**
 * Created by Ryan on 5/30/2015.
 */
public class Stepbuilder {

    public static void main(String[] args) {
        System.out.println(StepBuilder());
    }

    private static String StepBuilder() {
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
