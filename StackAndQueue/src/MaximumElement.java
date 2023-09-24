import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stackNumbers = new ArrayDeque<Integer>();
        if (1 <= numberCommands && numberCommands <= 100000){
            for (int i = 1; i <= numberCommands; i++) {
                int [] commands = Arrays
                        .stream(scanner.nextLine()
                                .trim()
                                .split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int command = commands[0];
                if (1 <= command && command <= 3){
                    if (command == 1){
                        int pushNumber = commands[1];
                        if (1 <= pushNumber && pushNumber <= 1000000000){
                            stackNumbers.push(pushNumber);
                        }

                    } else if (command == 2){
                        stackNumbers.pop();
                    } else {
                        ArrayList<Integer> sortedStack = new ArrayList<Integer>();
                        sortedStack.addAll(stackNumbers);
                        Collections.sort(sortedStack);
                        stackNumbers.clear();
                        stackNumbers.addAll(sortedStack);
                        int biggestNumber = stackNumbers.pollLast();
                        System.out.printf("%d %n", biggestNumber);
                    }

                }

            }

        }

    }
}
