public class Book {
    private static int nextId = 0;

    private int id;
    private String title;
    private String author;
    private String releaseYear;

    public Book(String title, String author, String releaseYear) {
        // preco sme priradili nextId++ ?
        this.id = nextId++;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseYear() {
        return releaseYear;
    }
}
