import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandValue = scanner.nextLine();
        String firstCompareValue = scanner.nextLine();
        String secondCompareValue = scanner.nextLine();
        getMax(commandValue, firstCompareValue, secondCompareValue);

    }

    public static void getMax(String commandValue, String firstCompareValue, String secondCompareValue){
        String result = "";
        String errorMessage = "Invalid command value!";
        if (commandValue.equals("int")){
            int first = Integer.parseInt(firstCompareValue);
            int second = Integer.parseInt(secondCompareValue);
            if(first == second) {
                result = "Compare digits are equals";
            } else if (first > second){
                result = firstCompareValue;
            } else {
                result = secondCompareValue;
            }
        } else if (commandValue.equals("char")) {
            char first = firstCompareValue.charAt(0);
            char second = secondCompareValue.charAt(0);
            if(first == second){
                result = "Compare chats are equals";
            }else if (first > second) {
                result = firstCompareValue;
            } else {
                result = secondCompareValue;
            }
        } else if (commandValue.equals("string")){
            int compare = firstCompareValue.compareTo(secondCompareValue);
            if (compare == 0){
                result = "Compare Strings are equals";
            } else if (compare > 0){
                result = firstCompareValue;
            } else {
                result = secondCompareValue;
            }
        } else {
            System.out.printf("%s", errorMessage);
        }

        System.out.printf("%s ", result);
    }
}
