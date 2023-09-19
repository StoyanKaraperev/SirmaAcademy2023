import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine()
                .trim()
                .split(" ");

        Random randomNumber = new Random();
        int maxWords = randomNumber.nextInt(words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s %n", words[randomNumber.nextInt(maxWords)]);
        }

    }

}
