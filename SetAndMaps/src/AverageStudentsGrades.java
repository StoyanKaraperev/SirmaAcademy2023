import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rotation = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> students = new TreeMap<>();
        for (int i = 0; i < rotation; i++) {
            String [] informationOfStudent = scanner.nextLine()
                    .trim()
                    .split("\\s+");
            String name = informationOfStudent[0];
            double grade = Double.parseDouble(informationOfStudent[1]);
            if (!students.containsKey(name)){
                ArrayList<Double> grades = new ArrayList<>();
                grades.add(grade);
                students.put(name, grades);
            } else {
                students.get(name).add(grade);
            }
        }

        for (Map.Entry<String, ArrayList<Double>> student : students.entrySet()) {
            String name = student.getKey();
            String grades = student.getValue()
                    .stream()
                    .map(e -> {
                        Formatter formatter = new Formatter();
                        return formatter.format("%.2f", e).toString();
                    })
                    .collect(Collectors.joining(" "));
            double sumOfGrades = student.getValue()
                    .stream()
                    .mapToDouble(Double::doubleValue)
                    .sum();
            double average = sumOfGrades / student.getValue().size();
            System.out.printf("%s -> %s (%.2f)%n", name, grades, average);
        }
    }
}
