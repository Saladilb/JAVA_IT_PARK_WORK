import java.util.Scanner; 

public class Program { 
    Scanner scanner = new Scanner(System.in); 
    int lenghtArray; 
    int [] arrayInput; 

    private void run() { 
        if (tryGettingLengthOfArray()) { 
            arrayInput = new int [lenghtArray];
            if (fillArrayElements()){
                System.out.print("Ваш массив -   ");
                for (int i = 0; i < arrayInput.length; i ++) {
                    System.out.print(arrayInput[i] + " ");
                }
                needResult();
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
                arrayInput[counter] = scanner.nextInt();
                counter ++;
            }
            else {
                System.out.println("Неверно введен элемент массива. Программа будет завершена. (после каждого элемента необходим Enter)");
                return false;
            }
        }
        return true;
    } 
    
    private void needResult() {
        long result = 1;
        for (int i = 0; i < lenghtArray; i ++) {
            if (i % 2 != 0) 
                if (arrayInput[i] % 2 == 0)
                    result *= arrayInput[i];  
        }
        System.out.println();
        System.out.println("Ваш результат = " + result);
    }

    public static void main (String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 
}
