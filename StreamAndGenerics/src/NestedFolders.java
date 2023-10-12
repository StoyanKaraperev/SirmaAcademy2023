import java.io.File;
import java.util.ArrayDeque;

public class NestedFolders {
    public static void main(String[] args) {
        String inputPath = "E:\\SirmaAcademy";
        File root = new File(inputPath);
        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(root);
        int count = 0;
        while (!directories.isEmpty()){
            File currentRood = directories.poll();
            File [] nestedFiles = currentRood.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()){
                    directories.offer(nestedFile);
                }
            }
            count++;
            System.out.println(currentRood.getName());
        }

        System.out.printf("%d folders", count);
    }
}
