import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine()
                .trim()
                .split("[\\s+]");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int[][] matrix = new int[rows][cols];
        fillTheMatrix(rows, matrix, scanner);

        int maxTotalSum = 0;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSum = matrix[row][col] +
                        matrix[row][col + 1] +
                        matrix[row + 1][col] +
                        matrix[row + 1][col + 1];
                if (currentSum > maxTotalSum){
                    maxTotalSum = currentSum;
                    startRow = row;
                    startCol = col;
                }
            }
        }

        printTheResult(maxTotalSum, matrix, startRow, startCol);
    }

    private static void printTheResult(int maxTotalSum, int[][] matrix, int startRow, int startCol) {
        System.out.println(maxTotalSum);
        System.out.printf("%d %d%n", matrix[startRow][startCol], matrix[startRow][startCol + 1]);
        System.out.printf("%d %d", matrix[startRow + 1][startCol], matrix[startRow + 1][startCol + 1]);
    }

    private static void fillTheMatrix(int rows, int[][] matrix, Scanner scanner) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays
                    .stream(scanner.nextLine()
                            .trim()
                            .split("[\\s+]"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
        }
    }
}
