import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class SetOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine()
                .split("\\s+");
        int firstRotation = Integer.parseInt(input[0]);
        int secondRotation = Integer.parseInt(input[1]);
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        TreeSet<Integer> result = new TreeSet<>();
        for (int i = 0; i < firstRotation; i++) {
            int inputFirst = Integer.parseInt(scanner.nextLine());
            firstList.add(inputFirst);
        }

        for (int i = 0; i < secondRotation; i++) {
            int inputSecond = Integer.parseInt(scanner.nextLine());
            secondList.add(inputSecond);
        }

        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                int firstNum = firstList.get(i);
                int secondNum = secondList.get(j);
                if (firstNum == secondNum){
                    result.add(secondList.get(j));
                }
            }
        }

        for (int num : result) {
            System.out.printf("%d ", num);
        }
    }

}
