package Figures;

import java.util.Random;

/**
 * Created by Student3 on 08.04.2017.
 */
public class Square implements Figure {
    int length;
    int width;
    int area = length * width;
    int perimeter = width + length;

    public Square() {
        Random random = new Random();
        length = random.nextInt(10);
        width = random.nextInt(10);
    }

    @Override
    public double area() {
        double area = length * width;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = width + length;
        return perimeter;
    }
}
