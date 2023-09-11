import java.util.Scanner;

public class P28ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double latitude = Double.parseDouble(scanner.nextLine());
        String either = scanner.nextLine();
        String climateZone = "";
        if (either.equals("N") || either.equals("S")){
            if (latitude == 0){
                climateZone = "Equator zone";
            } else if (Math.abs(latitude) <= 23.5){
                climateZone = "Tropical zone";
            } else if (Math.abs(latitude) <= 66.5){
                climateZone = "Temperate zone";
            } else if (Math.abs(latitude) <= 90){
                climateZone = "Arctic zone";
            } else {
                climateZone = "Invalid latitude!";
            }
        } else {
            climateZone = "Invalid either!";
        }

        System.out.printf("%s", climateZone);
    }
}
