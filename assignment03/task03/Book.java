package assignment03.task03;

public class Book {
    String title;
    String author;
    Double price;
    int year;
    Integer pages;

    public Book(String title, String author, Double price, int i, Integer pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = i;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + ", year=" + year + ", pages="
                + pages + "]";
    }

}
