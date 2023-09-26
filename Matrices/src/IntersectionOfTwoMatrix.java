import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        String [][] matrixOne = new String[rows][cols];
        String [][] matrixTwo = new String [rows][cols];
        String [][] resultMatrix = new String [rows][cols];
        fillTheMatrix(rows, matrixOne, scanner);
        fillTheMatrix(rows, matrixTwo, scanner);
        compareAndReplace(matrixOne, matrixTwo, resultMatrix);
        printingTheResult(resultMatrix);
    }

    private static void compareAndReplace(String[][] matrixOne, String[][] matrixTwo, String[][] resultMatrix) {
        for (int row = 0; row < matrixOne.length; row++) {
            for (int col = 0; col < matrixOne[row].length; col++) {
                if (!matrixOne[row][col].equals(matrixTwo[row][col])){
                    resultMatrix[row][col] = "*";
                } else {
                    resultMatrix[row][col] = matrixOne[row][col];
                }
            }
        }
    }

    private static void fillTheMatrix(int rows, String[][] matrix, Scanner scanner) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }

    private static void printingTheResult(String [][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length ; col++) {
                System.out.printf("%s ", matrix[row][col]);
            }

            System.out.println();
        }
    }
}
