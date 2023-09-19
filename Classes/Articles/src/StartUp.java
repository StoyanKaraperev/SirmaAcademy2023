import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] articleElement = scanner.nextLine()
                .trim()
                .split(", ");
        String title = articleElement[0];
        String content = articleElement[1];
        String author = articleElement[2];
        Article article = new Article(title, content, author);
        String errorMessage = "Invalid command!";
        int nuberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nuberOfCommands; i++) {
            String [] commandsAndContent = scanner.nextLine()
                    .trim()
                    .split(": ");
            String command = commandsAndContent[0];
            String newContent = commandsAndContent[1];
            if (command.equals("Edit")){
                article.edit(newContent);
            } else if (command.equals("ChangeAuthor")){
                article.changeAuthor(newContent);
            } else if (command.equals("Rename")){
                article.rename(newContent);
            } else {
                System.out.printf("%s ", errorMessage);
            }
        }

        System.out.println(article.toString());
    }
}
