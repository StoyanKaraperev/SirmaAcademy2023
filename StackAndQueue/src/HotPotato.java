import java.util.*;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputNames = scanner.nextLine()
                .trim()
                .split("\\s+");
        int rotation = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> names = new ArrayDeque<String>();
        Collections.addAll(names, inputNames);
        while (names.size() > 1){
            for (int i = 1; i < rotation; i++) {
                String addInFirstPosition = names.poll();
                names.offer(addInFirstPosition);
            }

            String nameToRemove = names.poll();
            System.out.printf("Removed %s %n", nameToRemove);
        }

        for (String winnerName : names) {
            System.out.printf("Last is %s ", winnerName);
        }
    }
}
