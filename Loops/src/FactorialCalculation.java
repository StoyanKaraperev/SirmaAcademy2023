import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int sumFactorial = 1;
        for (int i = 1; i <= inputNumber; i++){
            sumFactorial *= i;
        }

        System.out.println(sumFactorial);
    }
}
