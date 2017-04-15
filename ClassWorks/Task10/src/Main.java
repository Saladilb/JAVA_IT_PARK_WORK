import java.io.*;
import java.util.ArrayList;

public class Main {
    Figure [] figure = new Figure [5] ;
    private void run() {
        Rectangle rec1 = new Rectangle(12,23);
        Rectangle rec2 = new Rectangle(12,23);
        Square sq1 = new Square(12);
        Square sq2 = new Square(10);
        Triangle tr1 = new Triangle(12,22,14);

        figure[0] = rec1;
        figure[1] = rec2;
        figure[2] = sq1;
        figure[3] = sq2;
        figure[4] = tr1;

        WriteToFile();
    }

    private void WriteToFile() {
        try (FileWriter filewriter = new FileWriter("Figures.txt")) {
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

}
