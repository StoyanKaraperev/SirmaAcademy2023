import java.util.Arrays;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] password = scanner.nextLine().toCharArray();
        checkAndPrintPasswordValidation(password);
    }

    public static void checkAndPrintPasswordValidation(char [] password){
        int trueCount = 0;
        if (!(6 <= password.length && password.length <= 10))
        {
            System.out.println("Password must be between 6 and 10 characters!");
        } else {
            trueCount++;
        }

        int countFail = 0;
        for (int i = 0; i < password.length; i++) {
            char compareSymbol = password[i];
            if (!(Character.isLetterOrDigit(compareSymbol))) {
                System.out.println("Password must contain only letters and digits!");
                countFail++;
                break;
            }
        }

        if (countFail == 0){
            trueCount++;
        }

        int countForDigit = 0;
        for (int i = 0; i < password.length; i++) {
            char compareSymbol = password[i];
            if (Character.isDigit(compareSymbol)){
                countForDigit++;
            }

        }

        if (countForDigit < 2){
            System.out.println("Password must have at least 2 digits!");

        } else {
            trueCount++;
        }

        if (trueCount == 3){
            System.out.println("Password is valid!");
        }
    }

}
