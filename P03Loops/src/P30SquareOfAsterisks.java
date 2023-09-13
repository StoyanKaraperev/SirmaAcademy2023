import java.util.Scanner;

public class P30SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int originalNumber = inputNumber;
        while (inputNumber != 0){
            for (int i = 0; i < originalNumber; i++){
                System.out.print("* ");
            }
            System.out.println();
            inputNumber--;
        }
    }
}
