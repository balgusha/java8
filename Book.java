import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private String author;
    private String genre;
    private  String

    public Book(int id, String name, String author, String genre ) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + author + " | " + genre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
