import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputRotation = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<Double>> students = new LinkedHashMap<>();
        for (int i = 0; i < inputRotation; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!students.containsKey(student)){
                ArrayList<Double> grades = new ArrayList<>();
                grades.add(grade);
                students.put(student, grades);
            } else {
                students.get(student).add(grade);
            }
        }

        for (Map.Entry<String, ArrayList<Double>> studentsInformation : students.entrySet()) {
            String student = studentsInformation.getKey();
            ArrayList<Double> gradess = studentsInformation.getValue();
            double average = 0;
            if (gradess.size() > 1){
                for (int i = 0; i < gradess.size(); i++) {
                    average += gradess.get(i) / 2;
                }
            } else {
                average = gradess.get(0);
            }

            if (average >= 4.50) {
                System.out.printf("%s => %.2f%n", student, average);
            }
        }
    }
}
