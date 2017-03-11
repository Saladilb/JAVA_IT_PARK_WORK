
import java.util.Scanner; 

public class Program { 
    long result = 1; 
    int enterNumber = 0; 
    Scanner scanner = new Scanner(System.in); 

    private void run() { 
        if (checkStringForNumber()) {
            while (enterNumber != -1 ) { 
                if (checkForSimpleEnterNumber(enterNumber)) 
                    result *= enterNumber; 
                if (checkStringForNumber() == false)
                    break;
            }
            if (result != 1)
                System.out.println(result);  
        }
    }

    private boolean checkForSimpleEnterNumber(int enterNumber) { 
        if(enterNumber == 1) 
            return false; 
        for(int i = 2; i*i <= enterNumber; i++){ 
            if(enterNumber % i == 0) 
                return false; 
        } 
        return true; 
    } 

    private boolean checkStringForNumber() { 
        if (scanner.hasNextInt()) { 
            enterNumber = scanner.nextInt();
            return true;
        }
        else 
            System.out.println("Необходимо вводить число. Программа остановлена.");
        return false;
    } 

    public static void main(String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 
}