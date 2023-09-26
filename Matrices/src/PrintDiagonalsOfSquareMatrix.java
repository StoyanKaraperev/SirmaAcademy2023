import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCol = Integer.parseInt(scanner.nextLine());
        String [][] matrix = new String[rowCol][rowCol];

        fillTheMatrix(rowCol, matrix, scanner);

        ArrayList<String> firstDiagonal = new ArrayList<>();
        ArrayList<String> secondDiagonal = new ArrayList<>();
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            firstDiagonal.add(matrix[row][row]);
        }

        for (int row = matrix.length - 1; row >= 0; row--) {
            secondDiagonal.add(matrix[row][count]);
            count++;
        }

        printTheResult(firstDiagonal);
        printTheResult(secondDiagonal);
    }

    private static void printTheResult (ArrayList<String> words){
        for (String word : words) {
            System.out.printf("%s ", word);
        }
        System.out.println();
    }
    private static void fillTheMatrix(int rowCol, String[][] matrix, Scanner scanner) {
        for (int row = 0; row < rowCol; row++) {
            matrix[row] = scanner.nextLine()
                    .trim()
                    .split("\\s+");
        }
    }
}
