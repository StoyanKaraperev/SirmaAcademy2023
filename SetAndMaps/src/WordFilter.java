import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("\\s+");
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String [] temp = input[i]
                    .split("");
            if (temp.length % 2 == 0){
                result.add(input[i]);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
