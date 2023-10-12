import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializeReadAndWriteShape {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Shape> shapes = new ArrayList<>();
        Shape square = new Shape("Square", "green", 15.3, 12.4);
        Shape rectangle = new Shape("Rectangle", "red", 17.3, 18.4);
        Shape triangle = new Shape ("Triangle", "yellow", 12.3, 3.7);
        Collections.addAll(shapes, square, rectangle, triangle);
        String outputText = "E:\\SirmaAcademy\\Shapes.txt";

        try (FileOutputStream outputStream = new FileOutputStream(outputText);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(shapes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String inputText = "E:\\SirmaAcademy\\Shapes.txt";
        FileInputStream inputStream = new FileInputStream(inputText);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        List<Shape> shapesList = (List<Shape>) objectInputStream.readObject();

        for (Shape shape : shapesList) {
            System.out.printf("%s %s %.2f %.2f%n", shape.getName(), shape.getColor(), shape.getWidth(), shape.getHeight());
        }
    }
}
