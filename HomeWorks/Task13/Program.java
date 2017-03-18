
import java.util.Random;

public class Program { 
    int sizeArray;
    int [][] matrix;
    
    private void run() { 
        gettingRandomMatrix();
        showMatrix("Случайно сгенерированная матрица: ");
        showMatrixMaxElements("максимальные элементы: ", searchMaxElements());
    } 
    
    private void gettingRandomMatrix() {
        Random random = new Random();
        sizeArray = random.nextInt(5);
        while (sizeArray < 2)
            sizeArray = random.nextInt(5);
        matrix = new int [sizeArray][sizeArray];
        for (int i = 0; i < sizeArray ; i ++)
            for (int j = 0; j < sizeArray; j ++)
                matrix[i][j] = random.nextInt(10);
    } 

    private void showMatrix(String str) {
        System.out.print(str);
        for (int i = 0; i < sizeArray; i ++) {
            System.out.println("");
            for (int j = 0; j < sizeArray; j ++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
    
    private int [] searchMaxElements() {
        int [] maxElements;
        int maxElement;
        maxElements = new int [sizeArray];
        for (int i = 0; i < sizeArray ; i ++) {
            maxElement = matrix[0][i];
            for (int j = 0; j < sizeArray; j ++) {
                if (maxElement < matrix[j][i])
                    maxElement = matrix[j][i];
                if (j == sizeArray - 1)
                    maxElements[i] = maxElement;
            }
        }
        return maxElements;
    }
    
    private void showMatrixMaxElements(String str, int [] maxElements) {
        System.out.println(str);
        for (int i = 0; i < maxElements.length; i ++)
            System.out.println("В столбце " + i + " максимальный элемент = " + maxElements[i]);
    }

    public static void main (String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 
}
