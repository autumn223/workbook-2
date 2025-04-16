package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name.
        System.out.println("Please enter your name");

        // Prompt the user to enter their first name.
        // The input is read as a line of text and stored in the variable firstName.
        // We also use .trim() to remove any extra spaces before or after the name.
        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        // Prompt for middle name (optional).
        // If the user presses ENTER without typing anything, it will just be an empty string.
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        // Prompt for last name.
        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        // Prompt for suffix (optional, like "Jr" or "PhD").
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // Use StringBuilder to build the full name piece by piece.
        // Start with the first name.
        StringBuilder fullName = new StringBuilder(firstName);

        // If the user entered a middle name, add it with a space before it.
        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName);
        }

        // Add the last name (always required).
        fullName.append(" ").append(lastName);

        // If the user entered a suffix, add a comma and a space before the suffix.
        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        // Print out the final full name.
        System.out.println("Full name: " + fullName);
    }
}