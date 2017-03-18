
import java.util.Scanner;

public class Program {
    
    private int sumDigitsOfNumber(int numb) {  // Необходимая функция
        int sum = 0;
        while (numb >= 10) {
            sum += numb % 10;
            numb /= 10;
        }
        sum += numb;
        return sum;
    }
    
    private int tryGetNumb() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число больше 0");
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
            int sum = program.sumDigitsOfNumber(numb);
            System.out.println("Сумма цифр числа " + numb + " равна " + sum);
        }
    }
}
