package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder addressInfo = new StringBuilder();

        // Show the user a message asking them to enter some info
        System.out.println("Please provide the following information:");

        // Ask the user for their full name
        System.out.print("Full name: ");
        String fullName = scanner.nextLine(); // This reads what the user types and saves it in a variable
        addressInfo.append(fullName).append("\n"); // We add the full name to our address info

        // Add a label for the Billing Address section
        addressInfo.append("Billing Address:\n");

        // Ask for Billing Street
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        addressInfo.append(billingStreet).append("\n");

        // Ask for Billing City
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        // Ask for Billing State
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        // Ask for Billing Zip Code
        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        // Add the full billing address line (City, State Zip)
        addressInfo.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");

        // Add a label for the Shipping Address section
        addressInfo.append("Shipping Address:\n");

        // Ask for Shipping Street
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        addressInfo.append(shippingStreet).append("\n");

        // Ask for Shipping City
        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        // Ask for Shipping State
        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        // Ask for Shipping Zip Code
        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        // Add the full shipping address line (City, State Zip)
        addressInfo.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");

        // Print out all the collected information
        // We use .toString() to show the full text we built using StringBuilder
        System.out.println(); // Just prints a blank line for spacing
        System.out.println(addressInfo.toString());

        // Close the scanner to clean up resources
        scanner.close();
    }
}
