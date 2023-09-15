import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arrey = scanner.nextLine()
                        .trim()
                        .split(",");

        String [] newArray = new String [arrey.length];
        int rotation = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= arrey.length - 1; i++) {
            newArray[(i + rotation) % arrey.length] = arrey[i];
        }

        System.out.print(Arrays.toString(newArray));
    }
}
