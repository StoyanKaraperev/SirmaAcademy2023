import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String [] commands = scanner.nextLine()
                .trim()
                .split(", ");
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            resultList.add(numbers[i]);
        }
        for (int i = 0; i < commands.length; i++) {
            String [] splitCommands = commands[i]
                    .trim()
                    .split(" ");
            String command = splitCommands[0];
            if (command.equals("Add")){
                int addNumber = Integer.parseInt(splitCommands[1]);
                resultList.add(addNumber);
            } else if (command.equals("Remove")){
                int removeNumber = Integer.parseInt(splitCommands[1]);
                resultList.remove(Integer.valueOf(removeNumber));
            } else if (command.equals("RemoveAt")){
                int removeIndex = Integer.parseInt(splitCommands[1]);
                resultList.remove(removeIndex);
            } else if (command.equals("Insert")){
                int addNumber = Integer.parseInt(splitCommands[1]);
                int index = Integer.parseInt(splitCommands[2]);
                resultList.add(index, addNumber);
            }
        }

        for (int num : resultList) {
            System.out.printf("%d ", num);
        }
    }
}
