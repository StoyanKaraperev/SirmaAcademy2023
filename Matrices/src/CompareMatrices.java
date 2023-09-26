import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dimensionOfMatrixOne = (scanner.nextLine()
                        .trim()
                        .split("\\s+"));
        int rows = Integer.parseInt(dimensionOfMatrixOne[0]);
        int cols = Integer.parseInt(dimensionOfMatrixOne[1]);
        int [][] matrixOne = new int [rows][cols];
        for (int i = 0; i < rows; i++) {
            matrixOne[i] = Arrays
                    .stream(scanner.nextLine()
                            .trim()
                            .split("\\s+"))
                    .mapToInt((e -> Integer.parseInt(e)))
                    .toArray();
        }

        String [] dimensionOfMatrixTwo = (scanner.nextLine()
                .trim()
                .split("\\s+"));
        int rowsTwo = Integer.parseInt(dimensionOfMatrixTwo[0]);
        int colsTwo = Integer.parseInt(dimensionOfMatrixTwo[1]);
        int [][] matrixTwo = new int [rowsTwo][colsTwo];
        for (int i = 0; i < rowsTwo; i++) {
            matrixTwo[i] = Arrays
                    .stream(scanner.nextLine()
                            .trim()
                            .split("\\s+"))
                    .mapToInt((e -> Integer.parseInt(e)))
                    .toArray();
        }

        if (rows != rowsTwo || cols != colsTwo){
            System.out.println("Not equal");
            return;
        } else {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (matrixOne[row][col] != matrixTwo[row][col]){
                        System.out.println("Not equal");
                        return;
                    }
                }
            }
        }

        System.out.println("Equal");
    }
}
