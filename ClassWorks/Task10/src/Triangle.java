
public class Triangle extends Figure implements Figures{
    int sideA;
    int sideB;
    int sideC;
    public Triangle (int a, int b, int c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    @Override
    public String getFigure() {
        return "" + sideA + sideB + sideC;
    }
}
