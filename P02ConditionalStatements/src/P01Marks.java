import java.util.Scanner;

public class P01Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputMark = Double.parseDouble(scanner.nextLine());
        double excellentMark = 5.50;
        if (inputMark >= excellentMark){
            System.out.println("Excellent!");
        }
    }
}