package com.launchcode.mario.Printers;

import com.launchcode.mario.Printer;
import com.launchcode.mario.Pyramid;

/**
 * User: Ryan
 * Date: 6/10/2015
 * Time: 10:57 AM
 */
public class ConsolePrinter implements Printer {

    @Override
    public void Print(Pyramid steps) {
        System.out.print(steps.toString());
    }
}
