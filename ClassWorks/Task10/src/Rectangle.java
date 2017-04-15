
public class Rectangle extends Figure implements Figures{
    public Rectangle (int a, int b) {
        super();
        int height = a;
        int weight = b;
    }

    @Override
    public String getFigure() {
        return "" + weight + height;
    }
}
