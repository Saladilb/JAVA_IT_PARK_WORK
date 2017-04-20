import java.util.ArrayList;
import java.util.Random;

public class Main {
    private Random random = new Random();

    private void run() {
        int countOfTrasport = random.nextInt(40) + 10; // generation random total count of transport. Must be greater than 10 and less than 50
        ParkingPlace parkingPlace = new ParkingPlace();  // generation random parking;
        ArrayList transport = new ArrayList();
        createTransport(countOfTrasport);
    }

    private void createTransport(int countOfTrasport) {
        int countOfBike = random.nextInt(countOfTrasport / 3);
        int countOfMotorcycle = random.nextInt ((countOfTrasport - countOfBike) / 2);
        int countOfCar = countOfTrasport - (countOfBike + countOfMotorcycle);
        for (int i = 0; i < countOfBike; i ++)
            Bike bike = new Bike();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
