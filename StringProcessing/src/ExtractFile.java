import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputText = scanner.nextLine()
                .split("\\\\");
        String lastElement = inputText[inputText.length - 1];
        String[] file = lastElement
                .split("\\.(?=[^.]+$)");
        String fileName = file[0];
        String extension = file[1];
        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);
    }
}
