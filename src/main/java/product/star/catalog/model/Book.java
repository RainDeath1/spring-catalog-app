package product.star.catalog.model;

public class Book {
    private Long id;
    private String title;
    private String author;
    private int year;

    public Book(Long id,String title, String author, int year){
        this.author = author;
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
