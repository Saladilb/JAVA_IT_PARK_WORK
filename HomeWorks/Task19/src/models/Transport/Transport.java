package models.Transport;

import java.util.Random;

abstract class Transport {
    Random random = new Random();
    protected String transportNumber;
    protected boolean statusOfParking;

    public Transport() {
        setNumberOfTransport();       // create random number state machine. May not be ( just bought or another problem)
        setStatusOfParking();   // randomly we arrange the transport ( already parked or not)
    }


    private void setNumberOfTransport() {
        boolean existenceNumberOfCar = random.nextBoolean();
        if (existenceNumberOfCar)
            transportNumber = "" + getRandomChar() + random.nextInt(899) + 100 + getRandomChar() + getRandomChar();
    }

    private char getRandomChar() {
        return (char)(new Random().nextInt(26 + 'A'));
    }

    private void setStatusOfParking() {
        this.statusOfParking = statusOfParking;
    }

}
