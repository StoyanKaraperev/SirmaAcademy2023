import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedLightsaberDuels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputStrikes = scanner.nextLine()
                .trim()
                .split("");
        ArrayDeque<String> strikes = new ArrayDeque<>();
        int powerStrice = 0;
        String resultMessage = "Not Legendary";
        if (inputStrikes.length % 2 != 0){
            System.out.println(resultMessage);
            return;
        }
        for (int i = 0; i < inputStrikes.length; i++) {
            String strike = inputStrikes[i];
            if (strike.equals("(") || strike.equals("{") || strike.equals("!")){
                strikes.push(strike);
                if (strike.equals("!")){
                    powerStrice++;
                }
            } else if (strikes.isEmpty()){
                System.out.println(resultMessage);
                return;
            } else if (strike.equals(")")  || strike.equals("}") || powerStrice > 0){
                String compare = strikes.pop();
                if (compare.equals("(") && (!strike.equals(")"))
                        || compare.equals("{") && (!strike.equals("}"))
                        || compare.equals("!") && (!strike.equals("!"))){
                    System.out.println(resultMessage);
                    return;
                }
            }
        }

        resultMessage = "Legendary";
        System.out.println(resultMessage);
    }
}
