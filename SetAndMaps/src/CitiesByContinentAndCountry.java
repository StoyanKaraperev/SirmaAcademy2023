import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputRotation = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> continents = new LinkedHashMap<>();
        for (int i = 0; i < inputRotation; i++) {
            String[] input = scanner.nextLine()
                    .trim()
                    .split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];
            if (!continents.containsKey(continent)) {
                continents.put(continent, new LinkedHashMap<>());
            }

            if (!continents.get(continent).containsKey(country)){
                continents.get(continent).put(country, new ArrayList<>());
            }

            if (!continents.get(continent).get(country).contains(city)){
                continents.get(continent).get(country).add(city);
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> continentss : continents.entrySet()) {
            String continent = continentss.getKey();
            System.out.printf("%s:%n", continent);
            for (Map.Entry<String, ArrayList<String>> countriess : continentss.getValue().entrySet()) {
                String country = countriess.getKey();
                String citiess = String.join(", ", countriess.getValue());
                System.out.printf(" %s -> %s%n", country, citiess);
            }
        }
    }
}
