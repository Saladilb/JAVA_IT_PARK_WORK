
import java.util.Random;

public class Program { 
    int [][] matrix;
    
    private void run() { 
        int sizeArray = gettingRandomMatrix();
        showMatrix("Случайно сгенерированная матрица: ", sizeArray);
        rotatesMatrixCounterclockwise(sizeArray);
        showMatrix("Получившийся результат: ", sizeArray);
    } 
    
    private int gettingRandomMatrix() { 
        Random random = new Random();
        int sizeArray;
        sizeArray = random.nextInt(5);
        while (sizeArray < 2)
            sizeArray = random.nextInt(5);
        matrix = new int [sizeArray][sizeArray];
        for (int i = 0; i < sizeArray ; i ++)
            for (int j = 0; j < sizeArray; j ++)
                matrix[i][j] = random.nextInt(10);
        return sizeArray;
    } 

    private void showMatrix(String str, int sizeArray) {
        System.out.print(str);
        for (int i = 0; i < sizeArray; i ++) {
            System.out.println("");
            for (int j = 0; j < sizeArray; j ++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
    
    private void rotatesMatrixCounterclockwise(int sizeArray) {
        for (int i = 0; i < sizeArray / 2 ; i ++) {
            for (int j = 0; j < sizeArray / 2 + sizeArray % 2; j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][sizeArray - 1 - i];
                matrix[j][sizeArray - 1 - i] = matrix[sizeArray - 1 - i][sizeArray - j - 1];
                matrix[sizeArray - 1 - i][sizeArray - j - 1] = matrix[sizeArray - 1 - j][i];
                matrix[sizeArray - 1 - j][i] = temp;
            }
        }
    }
    
    public static void main (String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 
}
