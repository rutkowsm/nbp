package com.pjampr.vehicleConfig.VehicleInstances;

import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.VehicleType;

public class Vehicle {

    protected String registrationNumber;
    protected String brand;                 //brand of a vehicle manually set (e.g. Honda)
    protected String model;                 //model - manually set (e.g. NTV650 Revere)
    protected String additionalName;        //additional info like optional model name, popular nickname of a model, (e.g. RC33)
    protected int engineCapacity;           //Engine capacity in cm3 (e.g. 1998cm3 = 2.0 l)
    protected int horsePower;               //Horse power of the engine (e.g. 115hp)
    protected VehicleType vehicleType;      //Car, Lorry or a bike?
    protected String driversLicenceRequired; //What licence is required to rent this particular vehicle
    protected int yearsOfLicenceRequired;   //Number of years required of active driving to rent particular vehicle
    protected int wheels;                   //usually 4 for cars, 2 for motorbikes
    protected boolean isElectric;
    protected String colour;
    protected boolean hasInsurance;         //Was additional insurance purchased?
    protected boolean hasNavigation;        //Extra accesories added?


    public Vehicle(String registrationNumber, String brand, String model, String additionalName, int engineCapacity, int horsePower, VehicleType vehicleType, int wheels, boolean isElectric, String colour, boolean hasInsurance, boolean hasNavigation) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.additionalName = additionalName;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
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

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
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

    public String getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isElectric() {
        return isElectric;
    }


    public boolean hasNavigation() {
        return hasNavigation;
    }

    public void setHasNavigation(boolean hasNavigation) {
        this.hasNavigation = hasNavigation;
    }
}
