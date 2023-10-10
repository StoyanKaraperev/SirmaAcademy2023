import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        String inputText = scanner.nextLine();
        int totalSymbolsSum = 0;
        for (int i = 0; i < inputText.length(); i++) {
            char symbol = inputText.charAt(i);
            if (firstChar < symbol && symbol < secondChar){
                totalSymbolsSum += symbol;
            }
        }

        System.out.println(totalSymbolsSum);
    }
}
