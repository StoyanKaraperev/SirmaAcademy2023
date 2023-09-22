import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<String>();
        String firstPage = "";
        int count = 0;
        String currentPage = "";
        String systemMessage = "no previous URLs";
        while (!(inputString.equals("Home"))) {
            if (count == 0) {
                firstPage = inputString;
                count++;
            }
            if (inputString.equals("back")) {
                if (history.isEmpty()) {
                    currentPage = systemMessage;
                    history.push(firstPage);
                } else {
                    history.pop();
                    if (!(history.isEmpty())) {
                        currentPage = history.peek();
                    } else {
                        currentPage = systemMessage;
                        history.push(firstPage);
                    }
                }
            } else {
                history.push(inputString);
                currentPage = history.peek();
            }

            System.out.println(currentPage);
            inputString = scanner.nextLine();
        }

    }

}
