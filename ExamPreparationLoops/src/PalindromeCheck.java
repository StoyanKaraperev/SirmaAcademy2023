import java.util.Arrays;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] word = scanner.nextLine()
                .trim()
                .split("");
        String [] revers = new String [word.length];
        for (int i = 0; i <= word.length - 1; i++) {
            revers[i] = word[word.length - 1 - i];
        }

        if (Arrays.equals(word, revers)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
