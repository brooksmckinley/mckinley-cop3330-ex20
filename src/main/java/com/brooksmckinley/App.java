/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double order = scan.nextDouble();
        scan.nextLine(); // Throw away newline character
        System.out.print("What state do you live in? ");
        String state = scan.nextLine();
        double taxRate = 0.0;
        if (state.equalsIgnoreCase("wisconsin")) {
            taxRate += 0.05;
            System.out.print("What county do you live in? ");
            String county = scan.nextLine();
            if (county.equalsIgnoreCase("eu claire")) {
                taxRate += 0.005;
            } else if (county.equalsIgnoreCase("dunn")) {
                taxRate += 0.004;
            }
        }

        System.out.println(getReport(taxRate, order));
    }

    public static String getReport(double taxRate, double order) {
        double taxCents = order * taxRate * 100;
        double totalCents = Math.ceil(order * 100 + taxCents);

        String total = String.format("The total is $%.2f.", totalCents / 100);
        if (taxRate > 0.0) {
            return String.format("The tax is $%.2f.\n", taxCents / 100) + total;
        } else {
            return total;
        }
    }
}