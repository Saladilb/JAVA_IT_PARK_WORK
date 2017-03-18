
import java.util.Scanner;

public class Program {
    
    private boolean searchSimpleNumbers(int numb) {    // Необходимая функция.
        if (numb == 1)
            return false;
        for (int i = 2; i*i <= numb; i ++) {
            if (numb % i == 0)
                return false;
        }
        return true;
    }
    
    private int tryGetNumb() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int numb = scanner.nextInt();
            if (numb > 0)
                return numb;
        }
        System.out.println("Необходимо ввести целое число больше 0, программа остановлена.");
        return -1;
    }
    
    public static void main (String [] args) {
        Program program = new Program();
        int numb = program.tryGetNumb();
        if (numb != -1) {
            if (program.searchSimpleNumbers(numb))
                System.out.println("Число" + numb + " - простое");
            else
                System.out.println("Число" + numb + " не является простым");
        }
    }
}
