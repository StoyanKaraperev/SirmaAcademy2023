import java.util.Scanner;

public class P15CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        while (number != 1){
            if (number % 2 == 0){
                number /= 2;
            } else {
                number = (number * 3) + 1;
            }

            System.out.printf("%d ",number);
        }
    }
}
