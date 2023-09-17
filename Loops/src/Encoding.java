import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int AddNumber = 33;
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int reminder;
        int numToSymbol;
        char symbol;
        while (inputNumber != 0){
            reminder = inputNumber % 10;
            if (reminder == 0) {
                System.out.print("ZERO");
            }
            numToSymbol = reminder + AddNumber;
            symbol = (char) numToSymbol;
            for (int i = 0; i < reminder; i++){
                System.out.printf("%s", symbol);
            }
            System.out.println();
            inputNumber /= 10;
        }
    }
}
