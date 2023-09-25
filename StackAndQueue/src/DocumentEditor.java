import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DocumentEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> printerOutput = new ArrayDeque<String>();
        String lastElement = "";
        while (!(input.equals("End"))){
            String [] elements = input.split("\\W+");
            String command = elements[0];

            if (command.equals("Insert")){
                String addElement = elements[1];
                printerOutput.offer(addElement);

            } else if (command.equals("Undo")){
                lastElement = printerOutput.pollLast();
            } else if (command.equals("Redo")){
                printerOutput.offer(lastElement);
            }

            for (String word : printerOutput) {
                System.out.printf("%s ", word);
            }

            System.out.println();


            input = scanner.nextLine();
        }

    }
}
