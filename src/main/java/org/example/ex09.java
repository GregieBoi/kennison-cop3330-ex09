/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex09 {

    // main
    public static void main(String[] args) {

        // initialize conversion rate and variables, and compute area and amount of cans
        double conversion = 1.0 / 350.0;
        int length = get_length();
        int width = get_width();
        double area = length * width;
        double cans = area * conversion;

        // create format and set rounding mode
        DecimalFormat df = new DecimalFormat("#");
        df.setRoundingMode(RoundingMode.UP);

        // print output
        System.out.println("You will need to purchase " + df.format(cans) + " gallons of paint to cover " + df.format(area) + " square feet.");

    }

    // gets length of room
    public static int get_length() {

        // prompts for input and returns scan
        System.out.print("What is the length of the room in feet? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    // gets width of room
    public static int get_width() {

        // prompts for input and returns scan
        System.out.print("What is the width of the room in feet? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
