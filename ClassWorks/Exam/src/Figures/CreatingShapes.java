package Figures;

import java.util.Random;

/**
 * Created by Student3 on 08.04.2017.
 */
public class CreatingShapes {
    Random random = new Random();
    private int numberFigures;
    private Square arraySquares [];
    private Triangle arrayTriangles [];
    private Rectangle arrayRectangles [];



    public void run(int numberFigures) {
        this.numberFigures = numberFigures;
        int numberSquares = random.nextInt(numberFigures/2);
        int numberTriangles = random.nextInt((numberFigures - numberSquares) / 2);
        int numberRectangles = random.nextInt(numberFigures - numberSquares - numberTriangles);

        Square arraySquares [] = new Square[numberSquares];
        Triangle arrayTriangles [] = new Triangle [numberTriangles];
        Rectangle arrayRectangles [] = new Rectangle[numberRectangles];

        fillArrayShapes();
    }

    private void fillArrayShapes() {
        for (int i = 0; i < arraySquares.length - 1; i ++) {
            arraySquares[i] = new Square();
        }
        for (int i = 0; i < arrayTriangles.length - 1; i ++) {
            arrayTriangles[i] = new Triangle();
        }
        for (int i = 0; i < arrayRectangles.length - 1; i ++) {
            arrayRectangles [i] = new Rectangle();
        }
    }



}
