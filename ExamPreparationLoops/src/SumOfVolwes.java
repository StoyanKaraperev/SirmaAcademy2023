import java.util.Scanner;

public class SumOfVolwes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("");
        int totalSum = 0;
        for (int i = 0; i < input.length; i++) {
            String symbol = input[i];
            if (symbol.equals("a")){
                totalSum += 1;
            } else if (symbol.equals("e")){
                totalSum += 2;
            } else if (symbol.equals("i")){
                totalSum += 3;
            } else if (symbol.equals("o")){
                totalSum += 4;
            } else if (symbol.equals("u")){
                totalSum += 5;
            }
        }

        System.out.print(totalSum);
    }
}
