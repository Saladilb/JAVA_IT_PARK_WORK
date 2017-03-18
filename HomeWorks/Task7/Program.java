
import java.util.Random;

public class Program { 
    
    private void run() { 
        int [] array = gettingRandomArray();
        showArray(array, "Случайно сгенерированный массив для задачи: ");
        int sumLocalMax = searchSumOfLocalMax(array);
        System.out.println("  Сумма локальных максимумов = " + sumLocalMax);
            
    } 
    
    private int[] gettingRandomArray() {
        int [] array;
        Random random = new Random();
        int lenghtArray = random.nextInt(10);
        while (lenghtArray < 3) 
            lenghtArray = random.nextInt(10);
        array = new int [lenghtArray];
        for (int i = 0; i < lenghtArray - 1;i ++)
            array[i] = random.nextInt(100);
        
        return array;
    } 

    private void showArray(int[] array, String str) {
        System.out.print(str);
        for (int i = 0; i < array.length; i ++)
            System.out.print(array[i] + " ");
    }

    private int searchSumOfLocalMax(int[] array) {
        int sumLocalMax = 0;
        for (int i = 1; i < array.length - 1; i ++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1])
                sumLocalMax += 1;      
        }
        return sumLocalMax;
    }

    public static void main (String [] args) { 
        Program program = new Program(); 
        program.run(); 
    }
}
