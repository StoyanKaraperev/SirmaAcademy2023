import java.util.Scanner;

public class P31HalfRhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        for (int row = 1; row <= inputNumber; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = inputNumber - 1; row > 0; row--){
            for (int col = row; col > 0; col--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
