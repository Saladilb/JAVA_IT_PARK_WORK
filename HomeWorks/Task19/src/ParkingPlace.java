import java.util.ArrayList;


public class ParkingPlace {
    private int totalNumberOfParkingSpaces;
    private ArrayList parkedObjects = new ArrayList();
    private int numberOfAvailablePlaces;

    private boolean parking (Object object) {
        if (numberOfAvailablePlaces > 0)
            return true;
        return false;
    }
}
