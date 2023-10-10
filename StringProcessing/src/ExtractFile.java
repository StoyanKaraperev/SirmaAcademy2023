import java.util.Scanner;

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
