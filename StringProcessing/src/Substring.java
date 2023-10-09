import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removeElement = scanner.nextLine();
        String substring = scanner.nextLine();
        while (substring.contains(removeElement)){
            substring = substring.replace(removeElement, "");
        }

        System.out.println(substring);
    }
}
