package Generation;

import models.Transport.Bike;
import models.Transport.Car;
import models.Transport.Motorcycle;
import models.Transport.Transport;
import java.util.Random;

public class Generation {
    private static Generation genInstance = new Generation();
    public static Generation getInstance() {
        return genInstance;
    }
    private Random random = new Random();
    private Transport[] transport;
    private int totalNumberOfPlaces;

    private Generation() {
        generationTransport();
        generationRandomParkingPlace();
    }

    public Transport[] getTransport() {return transport;}

    public int getTotalNumberOfPlaces() {return totalNumberOfPlaces;}

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
                transport[i].setType("Car");
            }
            else if (i >= totalNumberOfCars && i < totalNumberOfMotorcycles) {
                transport[i] = new Motorcycle();
                transport[i].setType("Motorcycle");
            }
            else {
                transport[i] = new Bike();
                transport[i].setType("Bike");
            }
            transport[i].setTransportNumber(generationNumberOfTransport(transport[i].getType()));
        }
    }

    private String generationNumberOfTransport(String type) {
        int existenceNumberOfTransport = random.nextInt(10);
        if (existenceNumberOfTransport < 1 && type.equals("Bike")) {
            return null;
        }
        else {
            String number =  generationNumber();
            return number;
        }
    }

    private String generationNumber() {
        String forNumber = getRandomIntForNumber();
        String number =  "" + getRandomChar() + forNumber + getRandomChar() + getRandomChar();
        return number;
    }

    private String getRandomIntForNumber() {
        int numb = random.nextInt(999);
        if (numb < 10) {
            return "00" + numb;
        }
        else if (numb > 10 && numb < 100) {
            return "0" + numb;
        }
        return numb + "";
    }

    private char getRandomChar() {
        return (char)(random.nextInt(26) + 'A');
    }
}
