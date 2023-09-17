import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] commands = scanner.nextLine()
                .trim()
                .split(",");

        int initialNumber = 1;
        List<Integer> outputArray = new ArrayList<Integer>();
        for (String command : commands) {
            if (command.equals("add")){
                outputArray.add(initialNumber);
                initialNumber++;
            } else if (command.equals("remove")){
                int lastElement = outputArray.size() - 1;
                if (lastElement > 0){
                    outputArray.remove(lastElement);
                } else {
                    continue;
                }
            } else {
                System.out.println("Invalid command!");
            }
        }

        if (!outputArray.isEmpty()){
            for (Integer number : outputArray) {
                System.out.printf("%d ", number);
            }
        } else {
            System.out.println("Empty");
        }


    }
}
