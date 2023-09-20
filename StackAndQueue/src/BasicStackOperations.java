import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] commands = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int [] numbersToPush = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        fillTheStack(commands, numbersToPush, stack);
        popElementsOfTheStack(commands, stack);
        compareAndPrintTheResult(commands, stack);
    }

    public static void fillTheStack(int [] commands, int [] stackNumbers, ArrayDeque<Integer> stack){
        int numberToPushInStack = commands[0];
        for (int i = 0; i < numberToPushInStack; i++) {
            int pushElement = stackNumbers[i];
            stack.push(pushElement);
        }
    }

    public static void popElementsOfTheStack(int [] commands, ArrayDeque<Integer> stack){
        int numberToPop = commands[1];
        for (int i = 0; i < numberToPop; i++) {
            stack.pop();
        }
    }

    public static void compareAndPrintTheResult(int [] commands, ArrayDeque<Integer> stack){
        int compareNumber = commands[2];
        int count = 0;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.contains(compareNumber)){
                count++;
            }
        }

        if (stack.isEmpty()){
            System.out.println(0);
        } else if (count > 0){
            System.out.println("True");
        } else {
            ArrayList<Integer> sortedList = new ArrayList<Integer>();
            int originalSize = stack.size();
            for (int i = 0; i < originalSize ; i++) {
                int element = stack.pop();
                sortedList.add(element);
            }
            Collections.sort(sortedList);
            int smallestElement = sortedList.get(0);
            System.out.println(smallestElement);
        }
    }
}
