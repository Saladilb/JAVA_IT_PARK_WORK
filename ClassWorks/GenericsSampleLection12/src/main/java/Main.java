/**
 * Created by Student3 on 03.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        if (stringBox.hasValue()) {
            System.out.println("has value");
        }
    }
}
