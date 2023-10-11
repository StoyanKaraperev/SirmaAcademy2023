import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String inputText = "E:\\SirmaAcademy\\inputGenerics.txt";

        try (FileInputStream fileStream = new FileInputStream(inputText)){
            int oneByte = fileStream.read();
            while (oneByte >= 0){
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileStream.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
