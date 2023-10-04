import java.util.Scanner;

public class JediArchivesSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputNames = scanner.nextLine()
                .trim()
                .split(", ");
        String searchName = scanner.nextLine();
        int firstOccurrence = 0;
        int firstOccurrenceCount = 0;
        int occurenceCount = 0;
        int count = 0;
        for (int i = 0; i < inputNames.length; i++) {
            String name = inputNames[i];
            if (name.equals(searchName)) {
                if (firstOccurrenceCount == 0){
                    firstOccurrence = i;
                    firstOccurrenceCount++;
                }
                occurenceCount = i;
                count++;
            }
        }

        if (count > 0){
            System.out.printf("First occurrence: %d%n", firstOccurrence);
            System.out.printf("Last occurrence: %d%n", occurenceCount);
        } else {
            String errorMessage = "Record not found";
            System.out.println(errorMessage);

        }

    }
}
