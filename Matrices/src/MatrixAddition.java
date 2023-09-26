import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dimensionOfMatrix = scanner.nextLine()
                .trim()
                .split("\\s+");
        int rows = Integer.parseInt(dimensionOfMatrix[0]);
        int cols = Integer.parseInt(dimensionOfMatrix[1]);
        int [][] matrixOne = new int [rows][cols];
        int [][] matrixTwo = new int [rows][cols];
        int [][] resultMatrix = new int [rows][cols];
        for (int row = 0; row < rows; row++) {
            matrixOne[row] = Arrays
                    .stream(scanner.nextLine()
                            .trim()
                            .split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
        }

        for (int row = 0; row < rows; row++) {
            matrixTwo[row] = Arrays
                    .stream(scanner.nextLine()
                            .trim()
                            .split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
        }

        fillFinalResultMatrix(rows, cols, resultMatrix, matrixOne, matrixTwo);
        printingTheResult(resultMatrix);
    }

    private static void fillFinalResultMatrix(int rows, int cols, int[][] resultMatrix, int[][] matrixOne, int[][] matrixTwo) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                resultMatrix[row][col] = matrixOne[row][col] + matrixTwo[row][col];
            }
        }
    }

    private static void printingTheResult(int[][] resultMatrix) {
        for (int row = 0; row < resultMatrix.length; row++) {
            for (int col = 0; col < resultMatrix.length; col++) {
                System.out.printf("%d ", resultMatrix[row][col]);
            }

            System.out.println();
        }
    }


}
