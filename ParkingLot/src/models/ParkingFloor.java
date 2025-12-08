package models;

import enums.ParkingSpotType;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private final int floorNumber;
    private final List<ParkingSpot> spots = new ArrayList<>();


    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
    public void addParkingSpot(ParkingSpot spot){
        spots.add(spot);
    }
    public ParkingSpot getAvailableSpot(ParkingSpotType type){
        for(ParkingSpot s: spots){
            if(s.getType() == type && s.isFree()){
                return s;
            }
        }
        return null;
    }
}
