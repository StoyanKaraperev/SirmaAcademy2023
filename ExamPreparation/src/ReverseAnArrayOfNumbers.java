import java.util.*;

public class ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String [] inputArray = scanner.nextLine()
                .trim()
                .split("[,]");
        ArrayList<String> manipulatedArray = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            manipulatedArray.add(inputArray[i]);
        }

        Collections.reverse(manipulatedArray);
        System.out.println(String.join(" ", manipulatedArray));

//        for (int i = manipulatedArray.length - 1; i >= 0 ; i--) {
//            String pop = manipulatedArray[i];
//            System.out.printf("%s ", pop);
//        }
    }
}
