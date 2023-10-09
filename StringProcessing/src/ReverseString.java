import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")){
            StringBuilder sb = new StringBuilder();
            sb.append(input);
            sb.reverse();
            String reversWord = sb.toString();
            System.out.printf("%s = %s%n", input, reversWord);
            input = scanner.nextLine();
        }
    }
}
