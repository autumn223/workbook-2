package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) {

        // This is a for loop that counts down from 10 to 1
        for (int i = 10; i >= 1; i--) {
            // Print the current number
            System.out.println(i);

            // Pause the program for 1 second (1000 milliseconds)
            // We use try-catch to handle any errors that may happen during the pause
            try {
                Thread.sleep(1000); // Wait 1 second
            } catch (InterruptedException e) {
                // If an error happens, print a message
                System.out.println("The countdown was interrupted.");
            }
        }

        // After the countdown, print "Launch!"
        System.out.println("Launch!");
    }
}


