import java.util.Scanner;

public class FirstAndLastKNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rotation = Integer.parseInt(scanner.nextLine());
        String [] array = scanner.nextLine()
                .trim()
                .split(", ");
        String [] firstLine = new String[rotation];
        String [] secondLine = new String[rotation];
        for (int i = 0; i < rotation; i++) {
            firstLine[i] = array[i];
            secondLine[secondLine.length - 1 - i] = array[array.length - 1 - i];
        }

        System.out.println(String.join(" ", firstLine));
        System.out.println(String.join(" ", secondLine));
    }
}
