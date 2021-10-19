package com.pjampr.vehicleConfig.VehicleInstances;

public class Vehicle {

    protected String registrationNumber;
    protected String brand;
    protected String model;
    protected com.pjampr.vehicleConfig.VehicleInstances.vehicleType vehicleType;
    protected int wheels;
    protected boolean isElectric;
    protected String colour;
    protected boolean hasInsurance;
    protected boolean hasNavigation;


    public Vehicle(String registrationNumber, String brand, String model, com.pjampr.vehicleConfig.VehicleInstances.vehicleType vehicleType, int wheels, boolean isElectric, String colour, boolean hasInsurance, boolean hasNavigation) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
        this.wheels = wheels;
        this.isElectric = isElectric;
        this.colour = colour;
        this.hasInsurance = hasInsurance;
        this.hasNavigation = hasNavigation;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public com.pjampr.vehicleConfig.VehicleInstances.vehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(com.pjampr.vehicleConfig.VehicleInstances.vehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean getHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }
}
