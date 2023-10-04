import java.util.Scanner;

public class LettersInAWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char [] words = word.toCharArray();
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
