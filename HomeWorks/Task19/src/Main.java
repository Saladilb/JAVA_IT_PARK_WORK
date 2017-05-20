import Generation.Generation;
import models.Transport.Transport;

public class Main {
    Transport[] transport;
    int totalNumberOfPlaces;

    private void run() {
        Generation generation = Generation.getInstance();
        transport = generation.getTransport();
        totalNumberOfPlaces = generation.getTotalNumberOfPlaces();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

}
