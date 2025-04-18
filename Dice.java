package com.pluralsight;

public class Dice {

    // This method is named roll().
    // It returns (gives back) a random number from 1 to 6, just like a real dice.
    public int roll() {
        // Math.random() gives a decimal number between 0.0 and 1.0
        // We multiply it by 6 to get something between 0.0 and 5.999...
        // We then convert (cast) it to an int (whole number), which gives us 0 to 5
        // Adding 1 shifts the result to 1 through 6
        return (int)(Math.random() * 6) + 1;
    }
}