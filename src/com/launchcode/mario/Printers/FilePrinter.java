package com.launchcode.mario.Printers;

import com.launchcode.mario.Printer;
import com.launchcode.mario.Pyramid;

import java.io.*;

/**
 * User: Ryan
 * Date: 6/10/2015
 * Time: 10:57 AM
 */
public class FilePrinter implements Printer {

    @Override
    public void Print(Pyramid steps) {
        File file = new File("mario.txt");
        try (BufferedWriter output = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));) {
            output.write(steps.toString());
        } catch (java.io.IOException e) {
            System.out.println("There was an error:" + e.getMessage());
        }
    }
}
