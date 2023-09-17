import java.util.Scanner;

public class NumbersNTo0InReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLoops = Integer.parseInt(scanner.nextLine());
        if (inputLoops >= 0){
            for (int i = inputLoops; i >= 0; i--){
                System.out.println(i);
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
}
