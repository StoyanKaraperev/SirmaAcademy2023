import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        ArrayDeque<String> printerMemory = new ArrayDeque<String>();
        fillAndManipulationPrinterMemoryStack(printerMemory);
        printingPrinterMemory(printerMemory);
    }

    public static void fillAndManipulationPrinterMemoryStack(ArrayDeque<String> printerMemory){
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int count = 0;
        while (!(command.equals("print"))){
            if (command.equals("cancel")){
                if (count == 0){
                    String message = "Standby";
                    printerMemory.offer(message);
                } else {
                    count--;
                    String temp = printerMemory.pollLast();
                    printerMemory.offer("Canceled " + temp);
                }
            } else {
                printerMemory.offer(command);
                count++;
            }

            command = scanner.nextLine();
        }

    }

    public static void printingPrinterMemory(ArrayDeque<String> printerMemory){
        int originalSize = printerMemory.size();
        for (int i = 0; i < originalSize; i++) {
            String outputMessage = printerMemory.poll();
            System.out.println(outputMessage);
        }
    }
}
