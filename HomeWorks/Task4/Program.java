
import java.util.Scanner; 

public class Program { 
    Scanner scanner = new Scanner(System.in); 
    int lenghtArray; 
    int [] arrayForReversal; 

    private void run() { 
        if (tryGettingLengthOfArray()) { 
            arrayForReversal = new int [lenghtArray];
            if (fillArrayElements()){
                System.out.print("Ваш массив -   ");
                for (int i = 0; i < arrayForReversal.length; i ++) {
                    System.out.print(arrayForReversal[i] + " ");
                }
                reversalArray();
            }
        } 
    } 
    
     private boolean tryGettingLengthOfArray() { 
        System.out.println("Введите длинну массива"); 
        if (scanner.hasNextInt()) {
            lenghtArray = scanner.nextInt();
            if (lenghtArray < 2)
                return false;
            System.out.println("Длинна массива стала " + lenghtArray );
            return true; 
        } 
        else 
            System.out.println("Необходимо вввести длинну массива (натуральное число > 1). Программа остановлена."); 
        return false; 
    } 

    private boolean fillArrayElements() { 
        System.out.println("Введите элементы массива (целые числа) в столбец");
        int counter = 0;
        for (int i = 0; i < lenghtArray; i ++) {
            if (scanner.hasNextInt()) {
                arrayForReversal[counter] = scanner.nextInt();
                counter ++;
            }
            else {
                System.out.println("Неверно введен элемент массива. Программа будет завершена. (после каждого элемента необходим Enter)");
                return false;
            }
        }
        return true;
    } 

    private void reversalArray() {
        for (int i = 0; i < lenghtArray / 2; i ++) {
            int tmp = arrayForReversal[i];
            arrayForReversal[i] = arrayForReversal[lenghtArray - 1 - i];
            arrayForReversal[lenghtArray - 1 - i] = tmp;
        }
        System.out.println("");
        System.out.print("Получившийся массив - ");
        for (int i = 0; i < lenghtArray; i ++) {
           System.out.print(arrayForReversal[i] + " ");
        }     
    }
    
    public static void main (String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 
}
