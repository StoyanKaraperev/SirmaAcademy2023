import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            for (int j = 0; j < word.length(); j++) {
                sb.append(word);
            }
        }

        System.out.println(sb.toString());
    }
}
