import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        String inputText = "E:\\SirmaAcademy\\inputGenerics.txt";
        String outputText = "E:\\SirmaAcademy\\outputGenerics.txt";

        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, ',','.','!','?');
        try (InputStream inputStream = new FileInputStream(inputText);
             OutputStream outputStream = new FileOutputStream(outputText)){
            int oneBite = 0;
            while ((oneBite = inputStream.read()) >= 0){
                if (!(symbols.contains((char) oneBite))){
                    outputStream.write(oneBite);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
