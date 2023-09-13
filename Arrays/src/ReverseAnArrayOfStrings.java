import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine()
                .trim()
                .split(",");
        for (int i = 0; i < words.length / 2; i++){
            String reversElement = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = reversElement;
        }

        for (var word : words) {
            System.out.print(word + " ");
        }
    }
}
