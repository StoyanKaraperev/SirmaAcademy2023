import java.util.Scanner;

public class P26PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ingredientOne = scanner.nextLine();
        String ingredientTwo = scanner.nextLine();
        String resultOfMixing = "";
        if (ingredientOne.equals("herbs")){
            if (ingredientTwo.equals("water")){
                resultOfMixing = "Health potion";
            } else if (ingredientTwo.equals("oil")){
                resultOfMixing = "Stealth potion";
            } else {
                resultOfMixing = "Minor stamina potion";
            }
        } else if (ingredientOne.equals("berries")){
            if (ingredientTwo.equals("sugar")){
                resultOfMixing = "Speed potion";
            } else {
                resultOfMixing = "Minor energy potion";
            }
        } else {
            resultOfMixing = "Can't brew any potion";
        }

        System.out.printf("%s", resultOfMixing);
    }
}
