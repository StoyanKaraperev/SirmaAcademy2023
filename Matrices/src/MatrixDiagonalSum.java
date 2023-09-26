import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dimentions = scanner.nextLine()
                .trim()
                .split("\\s+");
        int rows = Integer.parseInt(dimentions[0]);
        int cols = Integer.parseInt(dimentions[1]);
        int [][] matrix = new int[rows][cols];
        fillTheMatrix(rows, matrix, scanner);
        int totalSum = 0;
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            totalSum += matrix[row][row];
        }

        for (int row = matrix.length - 1; row >= 0 ; row--) {
            totalSum += matrix[row][row];
        }

        System.out.println(totalSum);
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
