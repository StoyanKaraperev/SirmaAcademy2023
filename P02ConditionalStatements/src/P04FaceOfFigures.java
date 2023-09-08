import java.util.Scanner;

public class P04FaceOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double result = 0.0;
        switch(figure){
            case "square":
                double firstValue = Double.parseDouble(scanner.nextLine());
                result = Math.pow(firstValue, 2);
                System.out.printf("%.2f", result);
                break;
            case "rectangle":
                firstValue = Double.parseDouble(scanner.nextLine());
                double secondValue = Double.parseDouble(scanner.nextLine());
                result = firstValue * secondValue;
                System.out.printf("%.2f", result);
                break;
            case "circle":
                firstValue = Double.parseDouble(scanner.nextLine());
                result = Math.PI * Math.pow(firstValue, 2);
                System.out.printf("%.2f", result);
                break;
            case "triangle":
                firstValue = Double.parseDouble(scanner.nextLine());
                secondValue = Double.parseDouble(scanner.nextLine());
                result = (firstValue * secondValue) / 2;
                System.out.printf("%.2f", result);
                break;
            default:
                System.out.println("Invalid figure");
        }

    }
}
