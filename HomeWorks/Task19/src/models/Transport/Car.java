package models.Transport;

public class Car extends Transport implements ParkingObject{

    @Override
    public boolean toCallInTheParking() {
        return false;
    }

    @Override
    public boolean toLeaveTheParking() {
        return false;
    }
}
