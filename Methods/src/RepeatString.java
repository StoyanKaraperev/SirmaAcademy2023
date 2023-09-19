import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int repeatNumber = Integer.parseInt(scanner.nextLine());
        printingAndReturnNewStringRepeatedNTimesInOneLine(inputString, repeatNumber);
    }

    public static void printingAndReturnNewStringRepeatedNTimesInOneLine(String stringToRepeat, int numberToRepeat){
        for (int i = 0; i < numberToRepeat; i++) {
            System.out.printf("%s", stringToRepeat);
        }
    }
}
