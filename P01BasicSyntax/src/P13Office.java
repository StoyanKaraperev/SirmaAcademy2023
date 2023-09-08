import java.util.Scanner;

public class P13Office {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstCabinet = Double.parseDouble(scanner.nextLine());
        double secondCabinet = firstCabinet * 0.80;
        double thirdCabinet = (firstCabinet + secondCabinet) * 1.15;
        double totalSumOfCabinets = firstCabinet + secondCabinet + thirdCabinet;
        System.out.println(String.format("%.2f", totalSumOfCabinets));
    }
}
