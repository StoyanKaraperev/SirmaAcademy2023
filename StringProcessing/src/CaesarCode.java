import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char [] symbols = input.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            char symbol = (char) (symbols[i] + 3);
            System.out.print(symbol);
        }
    }
}
