package models.Transport;

public class Car extends Transport implements ParkingObject{

    @Override
    public String toCallInTheParking() {
        return null;
    }

    @Override
    public String toLeaveTheParking() {
        return null;
    }
}
