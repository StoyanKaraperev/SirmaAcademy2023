import java.util.Scanner;

public class P13PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--){
            result.append(input.charAt(i));
        }

        if (input.contentEquals(result)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
