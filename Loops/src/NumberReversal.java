import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int revers = 0;
        while (inputNumber != 0){
            int reminder = inputNumber % 10;
            revers = revers * 10 + reminder;
            inputNumber = inputNumber / 10;
        }

        System.out.printf("%d", revers);
    }
}
