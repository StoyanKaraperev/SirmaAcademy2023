import java.util.Scanner;

public class P29ArchitecturalEraIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearBuilding = Integer.parseInt(scanner.nextLine());
        String primaryMaterial = scanner.nextLine();
        String architecturalEra = "";
        if (0 < yearBuilding && yearBuilding < 500 && primaryMaterial.equals("stone")){
            architecturalEra = "Ancient";
        } else if (500 <= yearBuilding && yearBuilding <= 1500 && primaryMaterial.equals("stone")){
            architecturalEra = "Medieval";
        } else if (1500 <= yearBuilding && yearBuilding <= 1800 && primaryMaterial.equals("wood")){
            architecturalEra = "Colonial";
        } else if (1800 <= yearBuilding && yearBuilding <= 1900 && primaryMaterial.equals("steel")){
            architecturalEra = "Industrial";
        } else if (1900 < yearBuilding && primaryMaterial.equals("steel")) {
            architecturalEra = "Modern";
        } else {
            architecturalEra = "Uncertain";
        }

        System.out.printf("%s", architecturalEra);
    }
}
