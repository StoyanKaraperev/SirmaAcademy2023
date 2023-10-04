import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char [] bracketArray = input.toCharArray();
        ArrayDeque<Character> brackets = new ArrayDeque<Character>();
        String resultMessage = "False";
        if (bracketArray.length % 2 != 0){
            System.out.println(resultMessage);
            return;
        }
        for (char symbol : bracketArray) {
            if (symbol == '{'
                    || symbol == '['
                    || symbol == '(') {
                brackets.push(symbol);
            } else if (brackets.isEmpty()) {
                System.out.println(resultMessage);
                return;
            } else if (symbol == '}'
                    || symbol == ']'
                    || symbol == ')'){
                char element = brackets.pop();
                if (element == '{' && symbol != '}' || element == '[' && symbol != ']' || element == '(' && symbol != ')'){
                    System.out.println(resultMessage);
                    return;
                }
            }

        }

        resultMessage = "True";
        System.out.println(resultMessage);
    }
}
