import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputText = scanner.nextLine()
                .trim()
                .split("");
        Map<String, Integer> result = new TreeMap<>();
        for (String symbol : inputText) {
            if (!result.containsKey(symbol)){
                result.put(symbol, 1);
            } else {
                result.put(symbol, result.get(symbol) + 1);
            }
        }

        printingTheResult(result);
    }

    private static void printingTheResult(Map<String, Integer> result) {
        for (Map.Entry<String, Integer> print : result.entrySet()) {
            String symbol = print.getKey();
            int count = print.getValue();
            System.out.printf("%s : %d%n", symbol, count);
        }
    }
}
