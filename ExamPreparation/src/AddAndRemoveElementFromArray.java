import java.util.ArrayList;
import java.util.Scanner;

public class AddAndRemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] commands = scanner.nextLine()
                .trim()
                .split("[,]");
        ArrayList<String> result = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            if (command.equals("add")){
                result.add(String.valueOf(count));
                count++;
            } else if (command.equals("remove")){
                if (!result.isEmpty()){
                    result.remove(i - 1);
                }
            }
        }

        if (result.isEmpty()){
            System.out.println("Empty");
        } else {
            System.out.println(String.join(" ", result));
        }
    }
}
