import java.util.Scanner;

public class P27SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeOfDay = scanner.nextLine();
        String environment = scanner.nextLine();
        String item = scanner.nextLine();
        String courseOfAction = "";
        if (timeOfDay.equals("day")){
            if (environment.equals("forest")){
                if (item.equals("knife")){
                    courseOfAction = "Hunt for food";
                } else if (item.equals("container")){
                    courseOfAction = "Collect berries";
                } else {
                    courseOfAction = "Explore";
                }
            } else if(environment.equals("desert")){
                if (item.equals("hat")){
                    courseOfAction = "Search for water";
                } else {
                    courseOfAction = "Find shade";
                }
            }
        } else if (timeOfDay.equals("night")){
            if (environment.equals("forest")){
                if (item.equals("firestarter")){
                    courseOfAction = "Make a campfire";
                } else {
                    courseOfAction = "Climb a tree for safety";
                }
            } else if (environment.equals("desert")){
                if (item.equals("blanket")){
                    courseOfAction = "Sleep";
                } else {
                    courseOfAction = "Keep moving to stay warm";
                }
            }
        } else {
            courseOfAction = "Invalid part of the day!";
        }

        System.out.printf("%s", courseOfAction);
    }
}
