import java.util.Scanner;

public class P02LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        if (firstNumber > secondNumber){
            System.out.println(firstNumber);
        }
        else if (firstNumber < secondNumber) {
            System.out.println(secondNumber);
        }
        else {
            System.out.println("The numbers are equal!");
        }
    }
}
