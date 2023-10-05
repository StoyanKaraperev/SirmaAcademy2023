import java.util.*;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] input = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split("\\s+"))
                .mapToDouble(e -> Double.parseDouble(e))
                .toArray();
        Map<Double, Integer> resultArray = new LinkedHashMap<>();
        for (double firstDigit : input) {
            if (resultArray.containsKey(firstDigit)){
                resultArray.put(firstDigit, resultArray.get(firstDigit) + 1);
            } else {
                resultArray.put(firstDigit, 1);
            }
        }


        for (Map.Entry<Double, Integer> entry : resultArray.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
