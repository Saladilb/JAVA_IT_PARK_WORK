import java.util.Random;

abstract class Transport {
    Random random = new Random();
    protected String numberOfCar;
    protected boolean statusOfParking;

    public Transport() {
        setCountOfTrasports();  // generation random total count of transport. Must be greater than 10 and less than 50
        setNumberOfCar();       // create random number state machine. May not be ( just bought or another problem)
        setStatusOfParking();   // randomly we arrange the transport ( already parked or not)
    }


    private void setNumberOfCar() {
        boolean existenceNumberOfCar = random.nextBoolean();
        if (existenceNumberOfCar)
            numberOfCar = "" + getRandomChar() + random.nextInt(899) + 100 + getRandomChar() + getRandomChar();
    }

    private char getRandomChar() {
        return (char)(new Random().nextInt(26 + 'A'));
    }

    private void setStatusOfParking() {
        this.statusOfParking = statusOfParking;
    }

}
