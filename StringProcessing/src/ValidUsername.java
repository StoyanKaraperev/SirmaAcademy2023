import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split(", ");
        String pattern = "[A-Za-z0-9-_]{3,16}";
        Pattern regex = Pattern.compile(pattern);
        for (int i = 0; i < input.length; i++) {
            String text = input[i];
            Matcher matcher = regex.matcher(text);
            if (matcher.matches()){
                System.out.println(text);
            }

        }

    }
}
