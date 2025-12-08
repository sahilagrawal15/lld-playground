package models;

import enums.ParkingSpotType;

public class ParkingSpot {
    private final String id;
    private final ParkingSpotType type;
    private boolean isFree;
    private Vehicle parkedVehicle;

    public ParkingSpot(String id, ParkingSpotType type) {
        this.id = id;
        this.type = type;
        this.isFree = true;
    }

    public String getId() {
        return id;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public boolean isFree() {
        return isFree;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isFree = false;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isFree = true;
    }
}

