package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {

// We create a counter variable and set it to 0
        int count = 0;

        // This is a while loop. It keeps running as long as count is less than 5.
        while (count < 5) {
            // Print the message to the screen
            System.out.println("I love Java");

            // Increase the count by 1 to move toward ending the loop
            count++;
        }

        // Once count reaches 5, the loop stops and the program ends
    }
}