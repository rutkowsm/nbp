package com.pjampr.vehicleConfig.VehicleInstances;

import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.CarSubType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.DriveType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.VehicleType;

public class Car extends  Vehicle {

    protected CarSubType carSubType;    //SUV, LIMO, LORRY, etc...
    protected boolean hasSpareWheel;
    protected int numSeats;             //How many people can it carry?
    protected int numDoors;             //Quantity of door including trunk (typically 3, 4 or 5)
    protected DriveType driveType;         //front, back, 4x4, AWD, etc.

    public Car(String registrationNumber, String brand, String model, VehicleType vehicleType, int wheels, boolean isElectric, String colour, boolean hasInsurance, boolean hasNavigation, CarSubType carSubType, boolean hasSpareWheel, int numSeats, int numDoors, DriveType driveType) {
        super(registrationNumber, brand, model, vehicleType, wheels, isElectric, colour, hasInsurance, hasNavigation);
        this.carSubType = carSubType;
        this.hasSpareWheel = hasSpareWheel;
        this.numSeats = numSeats;
        this.numDoors = numDoors;
        this.driveType = driveType;
    }

    public CarSubType getCarSubType() {
        return carSubType;
    }

    public void setCarSubType(CarSubType carSubType) {
        this.carSubType = carSubType;
    }

    public boolean isHasSpareWheel() {
        return hasSpareWheel;
    }

    public void setHasSpareWheel(boolean hasSpareWheel) {
        this.hasSpareWheel = hasSpareWheel;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }
}
