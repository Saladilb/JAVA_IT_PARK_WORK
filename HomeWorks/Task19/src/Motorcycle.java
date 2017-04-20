
public class Motorcycle extends Transport implements ParkingObject{
    @Override
    public String getNumber() {
        return null;
    }

    @Override
    public boolean onParkingLot() {
        return false;
    }

    @Override
    public boolean leaveParkingLot() {
        return false;
    }
}
