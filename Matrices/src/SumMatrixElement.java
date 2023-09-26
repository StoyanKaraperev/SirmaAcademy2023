import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dimensions = scanner.nextLine()
                .trim()
                .split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int [][] matrix = new int[rows][cols];
        int totalSum = 0;
        fillTheMatrix(rows, matrix, scanner);
        totalSum = getTotalSum(matrix, totalSum);
        printTheResultOfCalculation(rows, cols, totalSum);
    }

    private static void printTheResultOfCalculation(int rows, int cols, int totalSum) {
        System.out.printf("The count of rows are: %d%n" +
                "The count of columns are: %d%n" +
                "Тhe total sum of all matrix elements are: %d", rows, cols, totalSum);
    }

    private static int getTotalSum(int[][] matrix, int totalSum) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                totalSum += matrix[row][col];
            }
        }
        return totalSum;
    }

    private static void fillTheMatrix(int rows, int[][] matrix, Scanner scanner) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays
                    .stream(scanner.nextLine()
                            .trim()
                            .split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
        }
    }
}
