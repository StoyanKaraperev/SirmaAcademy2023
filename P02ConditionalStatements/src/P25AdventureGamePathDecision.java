import java.util.Scanner;

public class P25AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rightHand = scanner.nextLine();
        String leftHand = scanner.nextLine();
        String output = "";
        if (rightHand.equals("sword")){
            if (leftHand.equals("shield")){
                output = "Path to the castle";
            } else {
                output = "Path to the forest";
            }
        } else if (rightHand.equals("map")){
            if (leftHand.equals("coins")){
                output = "Go to the town";
            } else {
                output = "Camp at the current spot and prepare for the next day";
            }
        } else {
            output = "Wander aimlessly";
        }

        System.out.printf("%s", output);
    }
}
