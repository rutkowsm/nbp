package com.pjampr.vehicleConfig.VehicleInstances;

public class Car extends  Vehicle {

    protected CarSubType carSubType;
    protected boolean hasSpareWheel;
    protected int numSeats;

    public Car(String registrationNumber, String brand, String model, com.pjampr.vehicleConfig.VehicleInstances.vehicleType vehicleType, int wheels, boolean isElectric, String colour, boolean hasInsurance, boolean hasNavigation, CarSubType carSubType, boolean hasSpareWheel) {
        super(registrationNumber, brand, model, vehicleType, wheels, isElectric, colour, hasInsurance, hasNavigation);
        this.carSubType = carSubType;
        this.hasSpareWheel = hasSpareWheel;
    }


}
