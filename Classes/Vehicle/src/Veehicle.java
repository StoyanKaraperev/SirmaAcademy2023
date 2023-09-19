public class Veehicle {
    private String type;
    private String model;
    private Engine engine;
    private double fuel;

    public Veehicle(String type, String model, Engine engine, double fuel){
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }

    public String getType() {
        return this.type;
    }

    public String getModel(){
        return this.model;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public double getFuel(){
        return this.fuel;
    }

    public void drive(double fuelConsumption){
        this.fuel -= fuelConsumption;
    }

    public void printFuelLeft(){
        System.out.println("The left fuel is: " + getFuel());
    }
}
