package Task001.entity;

public class Book {
    public Book(String name) {
        count++;
        this.idBook = count;
        this.name = name;
    }

    public Book(String name, String author, Genres genre) {
        count++;
        this.idBook = count;
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    private static int count=0;
    private int idBook;
    private String name;
    private String author;
    Genres genre;

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public int getIdBook() {
        return idBook;
    }

    public static void delCount(){
        count--;
    }

    public static void addCount(){
        count++;
    }


    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                '}';
    }
}
