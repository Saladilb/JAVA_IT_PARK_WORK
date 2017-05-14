package models.Transport;

public class Bike extends Transport implements ParkingObject{
    String bikenumber;
    @Override
    public boolean toCallInTheParking() {
        bikenumber = transportNumber;
        return false;
    }

    @Override
    public boolean toLeaveTheParking() {
        return false;
    }
}
