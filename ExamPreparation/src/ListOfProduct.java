import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListOfProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split(", ");
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String add = input[i];
            result.add(add);
        }

        Collections.sort(result);
        int count = 1;
        for (String word : result) {
            System.out.printf("%d. %s%n", count, word);
            count++;
        }
    }
}
