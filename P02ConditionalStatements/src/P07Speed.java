import java.util.Scanner;

public class P07Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = Integer.parseInt(scanner.nextLine());
        String result = "";
        if (speed <= 10){
            result = "Slow";
        } else if (speed <= 60){
            result = "Average";
        } else if (speed <= 120){
            result = "Fast";
        } else if (speed <= 160){
            result = "Super-fast";
        } else {
            result = "Turbo-fast";
        }

        System.out.println(result);
    }
}
