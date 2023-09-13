import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String errorMessageAge = "Invalid age!";
        String output = "";
        if (age < 0){
            output = errorMessageAge;
        } else if (age < 13){
            output = "Only U-rated movies.";
        } else if (age <= 17){
            output = "U and PG-13 rated movies.";
        } else {
            output = "All movies.";
        }

        System.out.printf("%s", output);
    }
}
