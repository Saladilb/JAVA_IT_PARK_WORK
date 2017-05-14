package models.Transport;

public class Motorcycle extends Transport implements ParkingObject{

    @Override
    public boolean toCallInTheParking() {
        return false;
    }

    @Override
    public boolean toLeaveTheParking() {
        return false;
    }
}
