import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        printingGradeWithWords(grade);
    }

    public static void printingGradeWithWords(double grade){
        String errorMessage = "Invalid grade";
        String gradeInWord = "";
        if (2.00 <= grade && grade <= 2.99){
            gradeInWord = "Fail";
        } else if (3.00 <= grade && grade <= 3.49){
            gradeInWord = "Poor";
        } else if (3.50 <= grade && grade <= 4.49){
            gradeInWord = "Good";
        } else if (4.50 <= grade && grade <= 5.49){
            gradeInWord = "Very good";
        } else if (5.50 <= grade && grade <= 6.00){
            gradeInWord = "Excellent";
        } else {
            gradeInWord = errorMessage;
        }

        System.out.printf("%s", gradeInWord);
    }
}
