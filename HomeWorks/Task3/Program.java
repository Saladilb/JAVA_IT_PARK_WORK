import java.util.Scanner; 

public class Program { 
    long result = 1; 
    int enterNumber = 0;
    int sumOfDigits = 0;
    byte stopProgram;
    Scanner scanner = new Scanner(System.in); 

    private void run() { 
        if (checkStringForNumber()) {
            while (enterNumber != -1 ) {
                getSumOfDigits();
                if (checkForSimpleEnterNumber()) {
                    result *= sumOfDigits;
                }
                sumOfDigits = 0;
                if (checkStringForNumber() == false)
                    break;
            }
            if (stopProgram != 1)
                System.out.println("Произведение чисел, сумма цифр которых - простое число, равно " + result);  
        }
    }

    private boolean checkForSimpleEnterNumber() { 
        if(sumOfDigits == 1) 
            return false; 
        for(int i = 2; i*i <= sumOfDigits; i++){ 
            if(sumOfDigits % i == 0) 
                return false; 
        } 
        return true; 
    } 

    private boolean checkStringForNumber() { 
        if (scanner.hasNextInt()) { 
            enterNumber = scanner.nextInt();
            return true;
        }
        else {
            System.out.println("Необходимо вводить число. Программа остановлена.");
            stopProgram = 1;
        }
        return false;
    } 
    
    private void getSumOfDigits() {
        while (enterNumber >= 10) {
            sumOfDigits += enterNumber % 10;
            enterNumber /= 10;
        }
        sumOfDigits += enterNumber;
    }

    public static void main(String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 

}