package models;

import enums.ParkingSpotType;

public class EntryGate {

    private final int gateId;
    private final ParkingFloor parkingLot;

    public EntryGate(int gateId, ParkingFloor parkingLot) {
        this.gateId = gateId;
        this.parkingLot = parkingLot;
    }

    public Ticket generateTicket(Vehicle vehicle) {

        ParkingSpotType spotType = getSpotTypeForVehicle(vehicle);

        ParkingSpot freeSpot = parkingLot.getAvailableSpot(spotType);

        if (freeSpot == null) {
            throw new RuntimeException("Parking lot full for type: " + spotType);
        }

        freeSpot.assignVehicle(vehicle);

        return new Ticket(vehicle, freeSpot, gateId);
    }

    private ParkingSpotType getSpotTypeForVehicle(Vehicle vehicle) {
        return switch (vehicle.getType()) {
            case BIKE -> ParkingSpotType.SMALL;
            case CAR -> ParkingSpotType.MEDIUM;
            case TRUCK -> ParkingSpotType.LARGE;
        };
    }
}
