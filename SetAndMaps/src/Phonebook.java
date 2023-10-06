import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phonebook = new TreeMap<>();
        while (!input.equals("stop")) {
            if (input.equals("search")) {
                input = searchNameAndPrintResult(scanner, phonebook);
            }

            if (input.equals("stop")) {
                break;
            }

            fillThePhonebook(input, phonebook);
            input = scanner.nextLine();
        }
    }

    private static String searchNameAndPrintResult(Scanner scanner, Map<String, String> phonebook) {
        String input;
        input = scanner.nextLine();
        String[] temp = input
                .split("-");
        String searchName = temp[0];
        while (temp.length < 2 && (!(searchName.equals("stop")))) {
            if (!phonebook.containsKey(searchName)) {
                System.out.printf("Contact %s not found.%n", searchName);
            } else {
                for (Map.Entry<String, String> phoneInfo : phonebook.entrySet()) {
                    String name = phoneInfo.getKey();
                    if (name.equals(searchName)) {
                        String phone = phoneInfo.getValue();
                        System.out.printf("%s -> %s%n", name, phone);
                    }
                }
            }

            input = scanner.nextLine();
            temp = input
                    .split("-");
            searchName = temp[0];

        }
        return input;
    }

    private static void fillThePhonebook(String input, Map<String, String> phonebook) {
        String[] info = input
                .split("-");
        String name = info[0];
        String phone = info[1];
        phonebook.put(name, phone);
    }
}
