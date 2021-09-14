/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testInWI() {
        String expected = "The tax is $0.50.\n" +
                "The total is $10.50.";
        String actual = App.getReport(0.05, 10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOutOfState() {
        String expected = "The total is $10.00.";
        String actual = App.getReport(0.0, 10);
        Assertions.assertEquals(expected, actual);
    }
}