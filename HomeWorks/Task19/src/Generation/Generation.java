package Generation;

import models.Transport.Bike;
import models.Transport.Car;
import models.Transport.Motorcycle;
import java.util.ArrayList;
import java.util.Random;

public class Generation {
    private static ArrayList TransportListObject = new ArrayList();
    private static Generation ourInstance = new Generation();

    public static ArrayList getInstance() {
        return TransportListObject;
    }

    private Generation() {
    }

    Random random = new Random();
    private int totalNumberOfPlaces;
    private int totalNumberOfTransport;
    private int totalNumberOfCars;
    private int totalNumberOfBikes;
    private int totalNumberOfMotorcycles;

    private Car cars [];
    private Bike bikes [];
    private Motorcycle motorcycles [];

    private void generStart() {
        generationTransport();   //random count
        generationRandomParkingPlace();
    }

    private void generationRandomParkingPlace() {
        totalNumberOfPlaces = random.nextInt(50) + 10;
    }

    private void generationTransport() {
        totalNumberOfTransport = random.nextInt(50) + 20;
        totalNumberOfCars = random.nextInt(totalNumberOfTransport/2) + totalNumberOfTransport/3;
        totalNumberOfMotorcycles = (totalNumberOfTransport - totalNumberOfCars) / 2 + 5;
        totalNumberOfBikes = totalNumberOfTransport - totalNumberOfCars - totalNumberOfMotorcycles;


        cars = new Car[totalNumberOfCars];
        motorcycles = new Motorcycle[totalNumberOfMotorcycles];
        bikes = new Bike[totalNumberOfBikes];

        for (int i = 0; i < cars.length - 1; i ++) {
            cars[i] = new Car();
        }

        for (int i = 0; i < motorcycles.length - 1; i ++) {
            motorcycles[i] = new Motorcycle();
        }

        for (int i = 0; i < bikes.length - 1; i ++) {
            bikes[i] = new Bike();
        }

    }
}
