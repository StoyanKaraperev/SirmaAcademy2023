import java.util.Arrays;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine()
                .trim()
                .split(", ");
        String text = scanner.nextLine();
        for (int i = 0; i < bannedWords.length; i++) {
            String banWord = bannedWords[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < banWord.length(); j++) {
                sb.append("*");
            }
            text = text.replace(banWord, sb.toString());
        }
        System.out.println(text);

    }
}
