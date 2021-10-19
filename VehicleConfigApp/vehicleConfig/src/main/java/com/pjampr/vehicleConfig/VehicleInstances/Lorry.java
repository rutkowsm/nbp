package com.pjampr.vehicleConfig.VehicleInstances;

import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.CarSubType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.DriveType;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.VehicleType;

public class Lorry extends Car{

    protected int packingCapacity;

    public Lorry(String registrationNumber, String brand, String model, String additionalName, int engineCapacity, int horsePower, VehicleType vehicleType, int wheels, boolean isElectric, String colour, boolean hasInsurance, boolean hasNavigation, CarSubType carSubType, boolean hasSpareWheel, int numSeats, int numDoors, DriveType driveType, int trunkCapacityLitres, int packingCapacity) {
        super(registrationNumber, brand, model, additionalName, engineCapacity, horsePower, vehicleType, wheels, isElectric, colour, hasInsurance, hasNavigation, carSubType, hasSpareWheel, numSeats, numDoors, driveType, trunkCapacityLitres);
        this.packingCapacity = packingCapacity;
    }
}
