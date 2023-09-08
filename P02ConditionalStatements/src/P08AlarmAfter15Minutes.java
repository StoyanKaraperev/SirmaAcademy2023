import java.util.Scanner;

public class P08AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutesAfterFifteen = minutes + 15;
        if (hours > 23){
            hours = 0;
        } else if (minutesAfterFifteen > 59){
            minutes = minutesAfterFifteen % 60;
            hours += 1;
            if(hours > 23){
                hours = 0;
            };
        } else {
            minutes += 15;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
