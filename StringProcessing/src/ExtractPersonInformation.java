import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInputNames = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberInputNames; i++) {
            String information = scanner.nextLine();
            String name = information.split("@")[1].split("\\|")[0];
            String age = information.split("#")[1].split("\\*")[0];
            System.out.printf("%s is %s years old.%n", name, age);
        }

    }
}
