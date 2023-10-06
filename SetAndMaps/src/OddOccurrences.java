import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine()
                .trim()
                .split("\\s+");
        Map<String, Integer> oddWords = new LinkedHashMap<>();
        for (String oddWord : words) {
            String word = oddWord.toLowerCase();
            if (oddWords.containsKey(word)){
                oddWords.put(word, oddWords.get(word) + 1);
            } else {
                oddWords.put(word, 1);
            }
        }

        ArrayList<String> print = new ArrayList<>();
        for (Map.Entry<String, Integer> wordsODD : oddWords.entrySet()) {
            if (wordsODD.getValue() % 2 != 0){
                print.add(wordsODD.getKey());
            }
        }

        System.out.print(String.join(", ", print));
    }
}
