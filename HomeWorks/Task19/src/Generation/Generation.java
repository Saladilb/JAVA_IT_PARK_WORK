package Generation;

import models.Transport.Bike;
import models.Transport.Car;
import models.Transport.Motorcycle;
import models.Transport.Transport;
import java.util.Random;

public class Generation {
    private static Generation genInstance = new Generation();

    private Random random = new Random();
    private Transport[] transport;
    private int totalNumberOfPlaces;

    public static Generation getInstance() {
        return genInstance;
    }
    public int getTotalNumberOfPlaces() {
        return totalNumberOfPlaces;
    }

    private Generation() {
        generationTransport();
        generationRandomParkingPlace();
    }

    private void generationRandomParkingPlace() {
        totalNumberOfPlaces = random.nextInt(50) + 10;
    }

    private void generationTransport() {
        int totalNumberOfTransport = random.nextInt(50) + 20;
        int totalNumberOfCars = random.nextInt(totalNumberOfTransport/2) + totalNumberOfTransport/3;
        int totalNumberOfMotorcycles = (totalNumberOfTransport - totalNumberOfCars) / 2 + 5;
        transport = new Transport[totalNumberOfTransport];

        for (int i = 0; i < totalNumberOfTransport; i ++) {
            if (i < totalNumberOfCars) {
                transport[i] = new Car();
            }
            else if (i >= totalNumberOfCars && i < totalNumberOfMotorcycles) {
                transport[i] = new Motorcycle();
            }
            else {
                transport[i] = new Bike();
            }
        }
    }

    private String generationNumberOfTransport() {
        boolean existenceNumberOfTransport = random.nextBoolean();
        if (existenceNumberOfTransport)
            return "" + getRandomChar() + random.nextInt(899) + 100 + getRandomChar() + getRandomChar();
        return null;
    }

    private char getRandomChar() {
        return (char)(new Random().nextInt(26 + 'A'));
    }

}
