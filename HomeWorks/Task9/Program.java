
import java.util.Random;

public class Program { 
    int numberOfRows;
    int numberOfColumns;
    int [][] matrix;
    int [] arrayOfMinElements;

    private void run() { 
        gettingRandomMatrix();
        showArray("Случайно сгенерированная матрица для задачи: ");
        getArrayOfMinElements();
        for (int i = 0; i < arrayOfMinElements.length; i++)
            System.out.println("Минимальный элемент строки " + (i + 1) + " = " + arrayOfMinElements[i]);
    } 
    
    private void gettingRandomMatrix() { 
        Random random = new Random();
        numberOfRows = random.nextInt(5);
        numberOfColumns = random.nextInt(5);
        while (numberOfRows < 2 || numberOfColumns < 2) {
            numberOfRows = random.nextInt(5);
            numberOfColumns = random.nextInt(5);
        }
        matrix = new int [numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows ;i ++)
            for (int j = 0; j < numberOfColumns; j ++)
                matrix[i][j] = random.nextInt(10);
    } 

    private void showArray(String str) {
        System.out.print(str);
        for (int i = 0; i < numberOfRows; i ++) {
            System.out.println("");
            for (int j = 0; j < numberOfColumns; j ++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    private void getArrayOfMinElements() {
        arrayOfMinElements = new int [numberOfRows];
        for (int i = 0; i < numberOfRows; i ++) {
            arrayOfMinElements[i] = matrix[i][0];
            for (int j = 0; j < numberOfColumns; j ++) {
                if (matrix[i][j] < arrayOfMinElements[i]) 
                    arrayOfMinElements[i] = matrix[i][j];    
            }
        }
    }
    
    public static void main (String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 
}
