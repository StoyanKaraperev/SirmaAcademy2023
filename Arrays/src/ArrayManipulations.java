import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String[] commands = scanner.nextLine()
                .trim()
                .split(", ");
        List<Integer> outputArray = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            outputArray.add(inputArray[i]);
        }

        for (String commandToSplit : commands) {
            String[] splitCommand = commandToSplit
                    .trim()
                    .split(" ");
            String command = splitCommand[0];
            if (command.equals("Add")) {
                int addNumber = Integer.parseInt(splitCommand[1]);
                outputArray.add(addNumber);
            } else if (command.equals("Remove")) {
                int removeNumber = Integer.parseInt(splitCommand[1]);
                outputArray.remove(Integer.valueOf(removeNumber));
            } else if (command.equals("RemoveAt")) {
                int removeIndexNumber = Integer.parseInt(splitCommand[1]);
                outputArray.remove(removeIndexNumber);
            } else if (command.equals("Insert")) {
                int addNumber = Integer.parseInt(splitCommand[1]);
                int index = Integer.parseInt(splitCommand[2]);
                outputArray.add(index, addNumber);
            }

        }

        for (Integer num : outputArray) {
            System.out.printf("%d ", num);
        }
    }
}
