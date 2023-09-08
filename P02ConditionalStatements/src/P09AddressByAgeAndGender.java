import java.util.Scanner;

public class P09AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();
        String address = "";
        if (age <= 16 ) {
            if (gender.equals("m")){
                address = "Master";
            } else if (gender.equals("f")){
                address = "Miss";
            } else {
                address = "Invalid gender";
            }
        } else {
            if (gender.equals("m")){
                address = "Mr.";
            } else if (gender.equals("f")){
                address = "Ms.";
            } else {
                address = "Invalid gender";
            }
        }

        System.out.println(address);
    }

}
