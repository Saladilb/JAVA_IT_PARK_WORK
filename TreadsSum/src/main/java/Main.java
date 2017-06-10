import java.util.Random;
import java.util.Scanner;

public class Main {
    public int n [];
    Random random = new Random();
    Scanner scanner;
    int forMostK;
    int andK;
    int min;
    int max;
    Thread [] threads;
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        for (int i = 0; i < n.length; i ++) {
            n[i] = random.nextInt(100);
        }


        System.out.println("ввести кол. элементов");
        int n = scanner.nextInt();
        System.out.println("ввести кол. потоков");
        int k = scanner.nextInt();
        if (n%k == 0) {
            forMostK = n/k;
        }
        else {
            forMostK = n/k;
            andK = n%k;
        }

        for (int i = 0; i <= forMostK + andK; i ++) {
            max = 0;
            min = max;
            if (n - max > forMostK) {
                max += forMostK;
            }
            else {
                max += andK;
            }
            OneThread thread = new OneThread(min,max);
            threads[i] = thread;
            thread.start();
        }
     }


}
