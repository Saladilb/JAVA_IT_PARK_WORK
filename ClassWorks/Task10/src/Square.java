
public class Square extends Figure implements Figures{
    public Square(int a) {
        int height = a;
        int weight = a;
    }

    @Override
    public String getFigure() {
        return "" + weight + height;
    }
}
