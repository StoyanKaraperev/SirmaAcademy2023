import java.util.ArrayList;
import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayList<Student> students = new ArrayList<Student>();
        while (!(command.equals("End"))){
            String [] information = command
                    .trim()
                    .split(" ");
            String firstName = information[0];
            String lastName = information[1];
            int age = Integer.parseInt(information[2]);
            String homeTown = information[3];
            Student student = new Student(firstName, lastName, age, homeTown);
            students.add(student);
            command = scanner.nextLine();
        }

        String findTown = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (findTown.equals(students.get(i).getHomeTown())){
                String firstName = students.get(i).getFirstName();
                String lastName = students.get(i).getLastName();
                int age = Integer.parseInt(String.valueOf(students.get(i).getAge()));
                String homeTown = students.get(i).getHomeTown();

                System.out.printf("%s %s %d is years old. %n", firstName, lastName, age);
            }
        }
    }
}
