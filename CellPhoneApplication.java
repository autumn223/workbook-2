package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Create a new CellPhone object using the default constructor
        CellPhone phone = new CellPhone();

        // Ask the user to enter the serial number
        System.out.print("What is the serial number? ");
        int serialNumber = 0;  // Create a variable to store the number

        try {
            // Read the line, remove extra spaces, and convert it to an integer
            serialNumber = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            // If the user didn't enter a valid number, show a message and set to 0
            System.out.println("That was not a valid number. Setting serial number to 0.");
        }

        // Set the serial number on the phone object
        phone.setSerialNumber(serialNumber);

        // Ask the user for the model and save it
        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        phone.setModel(model); // Store in the phone object

        // Ask for carrier
        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        phone.setCarrier(carrier);

        // Ask for phone number
        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        phone.setPhoneNumber(phoneNumber);

        // Ask for owner
        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);

        // Print a blank line for spacing
        System.out.println();

        // Now print all the details back to the screen
        System.out.println("Phone Information:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        // Close the scanner to free up resources
        scanner.close();
    }
}
