package com.pjampr.vehicleConfig.VehicleInstances;

import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.BikeSubtype;
import com.pjampr.vehicleConfig.VehicleInstances.Dictionaries.VehicleType;

public class Motorbike extends Vehicle{

    protected BikeSubtype bikeSubType;
    protected String tyreType;
    protected boolean hasPassengerSeat;
    protected boolean hasProtectionFrame;
    protected boolean hasCentralTrunk;
    protected boolean hasSideTrunks;


    public Motorbike(String registrationNumber, String brand, String model, String additionalName, int engineCapacity, int horsePower, VehicleType vehicleType, int wheels, boolean isElectric, String colour, boolean hasInsurance, boolean hasNavigation, BikeSubtype bikeSubType, String tyreType, boolean hasPassengerSeat, boolean hasProtectionFrame, boolean hasCentralTrunk, boolean hasSideTrunks) {
        super(registrationNumber, brand, model, additionalName, engineCapacity, horsePower, vehicleType, wheels, isElectric, colour, hasInsurance, hasNavigation);
        this.bikeSubType = bikeSubType;
        this.tyreType = tyreType;
        this.hasPassengerSeat = hasPassengerSeat;
        this.hasProtectionFrame = hasProtectionFrame;
        this.hasCentralTrunk = hasCentralTrunk;
        this.hasSideTrunks = hasSideTrunks;
    }
}
