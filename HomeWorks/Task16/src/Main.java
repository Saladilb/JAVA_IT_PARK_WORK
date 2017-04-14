
public class Main {

    public static int fibRun(int n) {
        if (n > 1) {
            return fibRun(n - 1) + fibRun(n - 2);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.fibRun(7));
    }
}
