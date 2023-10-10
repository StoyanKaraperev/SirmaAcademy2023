import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputString = scanner.nextLine()
                .split("");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < inputString.length - 1; i++) {
            String element = inputString[i];
            String nextElement = inputString[i + 1];
            if (!element.equals(nextElement)){
                result.add(inputString[i]);
            }
        }
        String lastElement = inputString[inputString.length - 1];
        result.add(lastElement);

        System.out.println(result.toString());
    }
}
