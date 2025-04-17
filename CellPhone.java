package com.pluralsight;

public class CellPhone {
    // These are the "properties" (also called fields) of a cell phone
    // They describe what info a cell phone has
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // This is a constructor with no parameters (called the default constructor)
    // It sets some default values when a new phone is created
    public CellPhone() {
        this.serialNumber = 0; // Default value for serial number
        this.model = "";       // Empty string for model
        this.carrier = "";     // Empty string for carrier
        this.phoneNumber = ""; // Empty string for phone number
        this.owner = "";       // Empty string for owner name
    }

    // These are "getter" methods — they let us read the values of the fields

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    // These are "setter" methods — they let us change the values of the fields

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
