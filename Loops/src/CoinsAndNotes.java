import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneLv = Integer.parseInt(scanner.nextLine());
        int twoLv = Integer.parseInt(scanner.nextLine());
        int fiveLv = Integer.parseInt(scanner.nextLine());
        int targetSum = Integer.parseInt(scanner.nextLine());
        int totalSum;
        for (int i = 0; i <= oneLv; i++){
            for (int y = 0; y <= twoLv; y++){
                for (int k = 0; k <= fiveLv; k++){
                    totalSum = i + y * 2 + k * 5;
                    if (totalSum == targetSum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.", i, y, k, totalSum);
                        System.out.println();
                    }
                }
            }
        }

    }
}
