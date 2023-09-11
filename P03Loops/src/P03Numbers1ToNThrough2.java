import java.util.Scanner;

public class P03Numbers1ToNThrough2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops = Integer.parseInt(scanner.nextLine());
        String errorMessage = "Invalid input!";
        if (loops < 0){
            System.out.printf("%s", errorMessage);
        } else {
            for (int i = 1; i <= loops; i+=2){
                System.out.println(i);
            }
        }
    }
}
