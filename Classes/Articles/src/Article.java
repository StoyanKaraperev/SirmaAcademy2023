public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String edit(String newContent){
        this.content = newContent;
        return this.content;
    }
    public String changeAuthor(String newAuthor){
        this.author = newAuthor;
        return this.author;
    }

    public String rename(String newTitle){
        this.title = newTitle;
        return this.title;
    }

    @Override
    public String toString(){
        return this.title + " - " + this.content + ":" + this.author;
    }
}
