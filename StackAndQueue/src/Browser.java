import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        ArrayDeque<String> history = new ArrayDeque<String>();
        fillAndPrintedOperationInBrowser(history);
    }

    public static void fillAndPrintedOperationInBrowser(ArrayDeque<String> history){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
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
