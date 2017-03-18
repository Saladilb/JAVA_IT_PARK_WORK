
import java.util.Random;

public class Program { 
    int numberOfRows;
    int numberOfColumns;
    int [][] matrix;

    private void run() { 
        gettingRandomMatrix();
        showArray("Случайно сгенерированная матрица для задачи: ");
        toNullTheMainDiagonal();
        showArray("Получившийся массив после обнуления главной диагонали: ");
    } 
    
    private void gettingRandomMatrix() {
        Random random = new Random();
        numberOfRows = random.nextInt(5);
        while (numberOfRows < 2 || numberOfColumns < 2) {
            numberOfRows = random.nextInt(5);
            numberOfColumns = numberOfRows;
        }
        matrix = new int [numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows ; i ++)
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

    private void toNullTheMainDiagonal() {
        for (int i = 0; i < numberOfRows; i ++){
            for (int j = 0; j < numberOfColumns; j ++) {
                matrix[i][i] = 0;
                break;
            }
        }
    }

    public static void main (String [] args) { 
        Program program = new Program(); 
        program.run(); 
    } 
}
