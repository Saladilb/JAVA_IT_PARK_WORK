import Generation.Generation;

import java.util.ArrayList;

public class Main {
    ArrayList transport;

    private void run() {
        Generation generation = Generation.getInstance();
        transport = generation.getTransportListObject();
        onParking();
    }

    private void onParking() {
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

}
