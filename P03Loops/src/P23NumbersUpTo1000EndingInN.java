import java.util.Scanner;

public class P23NumbersUpTo1000EndingInN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endNumber = Integer.parseInt(scanner.nextLine());
        int remainder = 0;
        for (int i = 1; i <= 1000; i++){
            remainder = i % 10;
            if (remainder == endNumber){
                System.out.printf("%d %n", i);
            }
        }

    }
}
