import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("");
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            String keySymbol = input[i];
            int countSymbol = 1;
            if (!keySymbol.equals(" ")){
                if (numbers.containsKey(keySymbol)){
                    numbers.put(keySymbol, numbers.get(keySymbol) + 1);
                } else {
                    numbers.put(keySymbol, countSymbol);
                }
            }
        }

        for (Map.Entry<String, Integer> result : numbers.entrySet()) {
            String key = result.getKey();
            int value = result.getValue();
            System.out.printf("%s -> %d%n", key, value);
        }
    }
}
