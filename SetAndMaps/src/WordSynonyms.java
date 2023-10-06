import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rotation = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> dictionary = new LinkedHashMap<>();
        fillTheMap(rotation, scanner, dictionary);
        printingTheResult(dictionary);
    }

    private static void fillTheMap(int rotation, Scanner scanner, LinkedHashMap<String, ArrayList<String>> dictionary) {
        for (int i = 0; i < rotation; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!dictionary.containsKey(word)){
                ArrayList<String> synonyms = new ArrayList<>();
                synonyms.add(synonym);
                dictionary.put(word, synonyms);
            } else {
                dictionary.get(word).add(synonym);
            }
        }
    }

    private static void printingTheResult(LinkedHashMap<String, ArrayList<String>> dictionary) {
        for (Map.Entry<String, ArrayList<String>> words : dictionary.entrySet()) {
            String word = words.getKey();
            String synonymos = String.join(", ", words.getValue());
            System.out.printf("%s - %s%n", word, synonymos);
        }
    }
}
