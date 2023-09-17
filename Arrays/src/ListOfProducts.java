import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputArray = scanner.nextLine()
                .trim()
                .split(", ");
        List<String> outputArray = new ArrayList<String>();
        for (int i = 0; i < inputArray.length; i++) {
            outputArray.add(inputArray[i]);
        }

        Collections.sort(outputArray);
        for (int i = 0; i < outputArray.size(); i++) {
            System.out.printf("%d. %s %n", i + 1, outputArray.get(i));
        }
    }
}
