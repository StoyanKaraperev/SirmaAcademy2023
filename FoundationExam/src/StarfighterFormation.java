import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StarfighterFormation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine()
                .trim()
                .split(", ");
        String commands = scanner.nextLine();
        ArrayList<String> manipulated = new ArrayList<>();
        int centerCount = 0;
        int swapCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            manipulated.add(numbers[i]);
        }
        while (!(commands.equals("end"))){
            String [] splitCommands = commands
                    .split(" ");
            String command = splitCommands[0];
            if (command.equals("destroy")){
                int removeIndex = Integer.parseInt(splitCommands[1]);
                if (removeIndex < manipulated.size() - 1){
                    manipulated.remove(removeIndex);
                }
            } else if (command.equals("swap")) {
                int firstIndex = Integer.parseInt(splitCommands[1]);
                int secondIndex = Integer.parseInt(splitCommands[2]);
                if (manipulated.size() >= firstIndex && manipulated.size() >= secondIndex){
                    Collections.swap(manipulated, firstIndex, secondIndex);
                } else {
                    swapCount++;
                }
            } else if (command.equals("add")){
                String newFighter = splitCommands[1];
                manipulated.add(newFighter);
            } else if (command.equals("insert")){
                String newFighter = splitCommands[1];
                int insertIndex = Integer.parseInt(splitCommands[2]);
                manipulated.add(insertIndex, newFighter);
            } else if (command.equals("center")){
                if (!(manipulated.isEmpty())){
                    if (manipulated.size() % 2 == 1){
                        int center = manipulated.size() / 2 + 1;
                        System.out.printf("%d %n", center);
                    } else {
                        int center = manipulated.size() / 2 + 1;
                        int centerOne = manipulated.size() / 2;
                        System.out.printf("%d %d %n", center, centerOne);
                    }
                    centerCount++;
                }
            }

            if (centerCount == 0 && swapCount == 0){
                for (String num : manipulated) {
                    System.out.printf("%s ", num);
                }
                System.out.println();
            } else {
                centerCount = 0;
            }

            commands = scanner.nextLine();
        }
    }
}
