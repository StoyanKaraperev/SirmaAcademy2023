public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(){
        this.brand = "unknown";
        this.model = "unknown";
        this.horsePower = -1;
    }

    public Car(String brand){
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.horsePower = -1;
    }

    public Car(String brand, String model, int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public void getBrand (String brand){
        this.brand = brand;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }

    public void getModel(String model){
        this.model = model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getHorsePower(int horsePower) {
        return this.horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    public void carInfo(){
        System.out.printf("The car is: %s %s - %d HP %n", brand, model, horsePower);
    }
}
