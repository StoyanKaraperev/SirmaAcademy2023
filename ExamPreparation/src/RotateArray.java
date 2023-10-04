import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .trim()
                .split("[,]");
        int rotation = Integer.parseInt(scanner.nextLine());
        String [] resultArray = new String[input.length];
        for (int i = 0; i <= input.length - 1; i++) {
            resultArray[(i + rotation) % input.length] = input[i];
        }

        System.out.println(String.join(" ", resultArray));
    }
}
