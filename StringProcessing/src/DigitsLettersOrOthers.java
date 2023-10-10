import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DigitsLettersOrOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char [] symbols = input.toCharArray();
        ArrayDeque<Character> digits = new ArrayDeque<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> other = new ArrayList<>();
        for (int i = 0; i < symbols.length; i++) {
            char symbol = symbols[i];
            if (Character.isDigit(symbol)){
                digits.add(symbol);
            } else if (Character.isLetter(symbol)){
                letters.add(symbol);
            } else {
                other.add(symbol);
            }
        }


        for (char ch : digits) {
            System.out.printf("%s", ch);
        }
        System.out.println();
        for (char ch : letters) {
            System.out.printf("%s", ch);
        }
        System.out.println();
        for (char ch : other) {
            System.out.printf("%s", ch);
        }
    }
}
