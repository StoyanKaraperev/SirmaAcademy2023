import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> companies = new LinkedHashMap<>();
        while (!input.equals("End")){
            String [] information = input
                    .trim()
                    .split("-> ");
            String company = information[0];
            String employeeId = information[1];
            if (!companies.containsKey(company)){
                ArrayList<String> employeesIds = new ArrayList<>();
                employeesIds.add(employeeId);
                companies.put(company, employeesIds);
            } else {
                for (Map.Entry<String, ArrayList<String>> info : companies.entrySet()) {
                    String companyiii = info.getKey();
                    ArrayList<String> emps = info.getValue();
                    if (companyiii.equals(company)){
                        if (!emps.contains(employeeId)){
                            companies.get(company).add(employeeId);
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> companiesInfo : companies.entrySet()) {
            String company = companiesInfo.getKey();
            ArrayList<String> employeess = companiesInfo.getValue();
            System.out.println(company);
            for (int i = 0; i < employeess.size(); i++) {
                String employee = employeess.get(i);
                System.out.printf("-- %s%n", employee);
            }

        }
    }
}
