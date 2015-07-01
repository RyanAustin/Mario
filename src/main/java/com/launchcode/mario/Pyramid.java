package com.launchcode.mario;

import javax.swing.*;

/**
 * User: Ryan
 * Date: 6/24/2015
 * Time: 10:53 AM
 */
public class Pyramid {

    // ATTRIBUTES
    StringBuilder steps = new StringBuilder();

    // CONSTRUCTOR
    public Pyramid () {
        // Retrieve number of steps
        int numSteps = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of steps"));

        int spaces = numSteps - 1;
        int hashes = 2;

        // Loop to create steps
        for (int i = 0; i < numSteps; i++) {
            for (int j = 0; j < spaces; j++) {
                this.steps.append(" ");
            }
            for (int k = 0; k < hashes; k++) {
                this.steps.append("#");
            }
            this.steps.append("\n");
            hashes++;
            spaces--;
        }
    }

    @Override
    public String toString() {
        return steps.toString();
    }
}
