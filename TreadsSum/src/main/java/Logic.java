import java.util.Random;
import java.util.Scanner;

public class Logic {
    private int min, max, countThreads, countElements, forMostThreads, forFirst;
    Random random = new Random();
    private Scanner scanner;

    private static Logic ourInstance = new Logic();

    public static Logic getInstance() {return ourInstance;}

    public void run() {
        getUserSettings();
        createAndFillArray();
        creatingBoundaries();
        useThreads();
        showResult();
    }

    private void creatingBoundaries() {
        forMostThreads = countElements / countThreads;
        forFirst = countElements % countThreads;
        max = forMostThreads + forFirst;
    }

    private void getUserSettings() {
        scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, количество элементов в создаваемом массиве (длинну)");
        countElements = tryRecordIntOfScanner();
        System.out.println("Пожалуйста, укажите необходимое количество потоков");
        countThreads = tryRecordIntOfScanner();
    }

    private int tryRecordIntOfScanner() {
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }
        else {
            System.out.println("Необходимо ввести число. ");
            scanner.nextLine();
        }
        if (a < 1 | a > 1000000) {
            System.out.println("Неверное значение. Необходимо ввести значение от 1 до 1.000.000.   Пожалуйста, повторите ввод");
            a = tryRecordIntOfScanner();
        }
        return a;
    }

    private void createAndFillArray() {
        Data.setArr(countElements);
        int needSum = 0;
        System.out.println("Созданный массив: ");
        for (int i = 0; i < countElements; i++) {
            Data.getArr()[i] = random.nextInt(100);
            needSum += Data.getArr()[i];
            System.out.print(Data.getArr()[i] + " ");
        }
        System.out.println();
        System.out.println("Ожидаемый результат = " + needSum);
    }

    private void useThreads() {
        for (int i = 0; i < countThreads; i++) {
            OneThread oneThread = new OneThread(min, max);
            oneThread.start();
            try {
                oneThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            min = max;
            max += forMostThreads;
        }
    }

    private void showResult() {
        System.out.println("Результат программы: " + Data.getResult());
    }
}
