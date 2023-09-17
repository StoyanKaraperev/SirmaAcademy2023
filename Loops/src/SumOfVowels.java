import java.util.Scanner;

public class SumOfVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        int totalSum = 0;
        for (int i = 0; i < letter.length(); i++){
            char symbol = letter.charAt(i);
            if (symbol == 'a'){
                totalSum += 1;
            } else if (symbol == 'e'){
                totalSum += 2;
            } else if (symbol == 'i'){
                totalSum += 3;
            } else if (symbol == 'o'){
                totalSum += 4;
            } else if (symbol == 'u'){
                totalSum += 5;
            }
        }

        System.out.printf("%d", totalSum);
    }
}
