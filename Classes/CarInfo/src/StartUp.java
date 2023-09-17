import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInputCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberInputCars; i++) {
            String [] infoCar = scanner.nextLine()
                    .trim()
                    .split(" ");
            if (infoCar.length == 1){
                String brand = infoCar[0];
                Car car = new Car(brand);
                car.carInfo();
            } else if (infoCar.length == 2){
                String brand = infoCar[0];
                String model = infoCar[1];
                Car car = new Car(brand, model);
                car.carInfo();
            } else if (infoCar.length == 3){
                String brand = infoCar[0];
                String model = infoCar[1];
                int horsePower = Integer.parseInt(infoCar[2]);
                Car car = new Car(brand, model, horsePower);
                car.carInfo();
            } else {
                System.out.println("Invalid information for car");
            }

        }
    }
}
