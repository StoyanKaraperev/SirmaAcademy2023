import java.util.Scanner;

public class P21UniversityAdmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        int extracurricularActivities = Integer.parseInt(scanner.nextLine());
        String output = "";
        if (score >= 90){
            output = "admitted";
        } else if (score >= 80){
            if (extracurricularActivities >= 2){
                output = "admitted";
            } else {
                output = "not admitted";
            }
        } else {
            output = "not admitted";
        }

        System.out.printf("The student is %s", output);
    }
}
