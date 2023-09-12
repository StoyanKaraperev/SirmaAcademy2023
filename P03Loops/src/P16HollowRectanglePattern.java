import java.util.Scanner;

public class P16HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputRow = Integer.parseInt(scanner.nextLine());
        int inputCol = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < inputRow; row++){
            if (row == 0 || row == inputRow -1){
                for (int col = 0; col < inputCol; col++){
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int col = 0; col < inputCol; col++){
                    if (col == 0 || col == inputCol -1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }
}
