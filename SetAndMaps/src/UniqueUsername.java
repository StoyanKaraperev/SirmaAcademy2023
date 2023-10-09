import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputUsers = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> users = new LinkedHashSet<>();
        for (int i = 0; i < inputUsers; i++) {
            String name = scanner.nextLine();
            users.add(name);
        }

        for (String user : users) {
            System.out.println(user);
        }
    }
}
