import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBites {
    public static void main(String[] args) {
        String inputText = "E:\\SirmaAcademy\\inputGenerics.txt";
        String outputText = "E:\\SirmaAcademy\\CopyBite.txt";

        try (FileInputStream inputStream = new FileInputStream(inputText);
             FileOutputStream outputStream = new FileOutputStream(outputText)) {
            int oneBite = 0;
            while ((oneBite = inputStream.read()) >= 0){
                if (oneBite == 10 || oneBite == 32){
                    outputStream.write(oneBite);
                } else {
                    String digits = String.valueOf(oneBite);
                    for (int i = 0; i < digits.length(); i++) {
                        outputStream.write(digits.charAt(i));
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
