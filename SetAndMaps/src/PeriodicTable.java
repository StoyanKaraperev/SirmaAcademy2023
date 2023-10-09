import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputRotation = Integer.parseInt(scanner.nextLine());
        TreeSet<String> result = new TreeSet<>();
        for (int i = 0; i < inputRotation; i++) {
            String [] elements = scanner.nextLine()
                    .trim()
                    .split("\\s+");
            for (int j = 0; j < elements.length; j++) {
                result.add(elements[j]);
            }
        }

        for (String element : result) {
            System.out.printf("%s ", element);
        }
    }
}
