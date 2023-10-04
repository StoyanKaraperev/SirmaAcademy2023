import java.util.Arrays;
import java.util.Scanner;

public class SithCodeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.nextLine();
        int rotation = Integer.parseInt(scanner.nextLine());
        char [] manipulatedMessage = inputMessage.toCharArray();
        char [] resultMessage = new char[manipulatedMessage.length];
        for (int i = 0; i < manipulatedMessage.length; i++) {
            if (1 <= rotation && rotation <= 25
                    || 1 <= manipulatedMessage[i] && manipulatedMessage[i] <= 100){
                char symbol = (char)(manipulatedMessage[i] + rotation);
//                if (Character.isLetter(symbol)){
//                    resultMessage[i] = symbol;
//                } else {
//                    resultMessage[i] = manipulatedMessage[i];
//                }
                resultMessage[i] = symbol;
            }

        }

        for (char symbol : resultMessage) {
            System.out.printf("%s", symbol);
        }
    }
}
