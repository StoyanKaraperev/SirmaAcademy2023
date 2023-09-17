import java.util.Scanner;

public class Numbers1ToNThroughM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops = Integer.parseInt(scanner.nextLine());
        int step = Integer.parseInt(scanner.nextLine());
        String errorMessage = "Invalid input";
        if (loops < 0 || step < 0){
            System.out.printf("%s", errorMessage);
        } else {
            for (int i = 1; i <= loops; i+=step){
                System.out.println(i);
            }
        }

    }
}
