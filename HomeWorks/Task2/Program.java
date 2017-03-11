import java.util.Scanner; 

public class Program { 
    long result = 0; 
    int enterNumber = 0; 
    int counter = 0;
    Scanner scanner = new Scanner(System.in); 

    private void run() { 
        if (checkStringForNumber()) {
            while (enterNumber != -1 ) {
                counter ++;
                if (counter % 2 == 0)
                    result += enterNumber;
                if (checkStringForNumber() == false)
                    break;
            }
            if (counter != -1)
                System.out.println(result);  
        }
    }

    private boolean checkStringForNumber() { 
        if (scanner.hasNextInt()) { 
            enterNumber = scanner.nextInt();
            return true;
        }
        else { 
            System.out.println("Необходимо вводить число. Программа остановлена.");
            counter = -1;
        }
        return false;
    } 

    public static void main(String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 
}