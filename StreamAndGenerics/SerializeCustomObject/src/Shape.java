import java.io.Serializable;

public class Shape implements Serializable {
    private String name;
    private String color;
    private double width;
    private double height;

    public Shape (String name, String color, double width, double height){
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

}
