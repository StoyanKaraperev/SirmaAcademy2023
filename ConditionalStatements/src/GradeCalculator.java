import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int percentage = Integer.parseInt(scanner.nextLine());
        String grade = "";
        String errorMessage = "Invalid percentage";
        if (!(percentage <= 100 && percentage >= 0)){
            System.out.printf("%s", errorMessage);
            return;
        } else if (percentage >= 90){
            grade = "A";
        } else if (percentage >= 80){
            grade = "B";
        } else if (percentage >= 70){
            grade = "C";
        } else if (percentage >= 60){
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.printf("The grade is: %s", grade);
    }
}
