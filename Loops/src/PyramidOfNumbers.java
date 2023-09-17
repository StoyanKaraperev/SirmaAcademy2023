import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumbers = Integer.parseInt(scanner.nextLine());
        int count = 1;
        for (int row = 1; row <= inputNumbers; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(count + " ");
                count++;
                if (count > inputNumbers){
                    return;
                }
            }
            System.out.println();
        }
    }
}
