
import java.util.Random;

public class Program { 
    Random random = new Random();
    int numberOfRows;
    int numberOfColumns;
    int [][] matrix;

    private void run() { 
        gettingRandomMatrix();
        showArray("Случайно сгенерированная матрица для задачи: ");
        System.out.println();
        System.out.println("Среднее арифметическое матрицы = " + getArithmeticMean());
    } 
    
    private void gettingRandomMatrix() { 
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
    }

    private int getArithmeticMean() {
        int arithmeticMean;
        int counter = 0;
        int sumElements = 0;
        for (int i = 0; i < numberOfRows; i ++) {
            for (int j = 0; j < numberOfColumns; j ++) {
                sumElements += matrix[i][j];
                counter += 1;
            }
        }
        return arithmeticMean = sumElements / counter;
    }
    
    public static void main (String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 
}
