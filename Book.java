public class Book {

    private final String name;
    private final String author;
    private final int amountPages;
    private final int ISBN;

    public Book(String name, String author, int amountPages, int ISBN) {
        this.name = name;
        this.author = author;
        this.amountPages = amountPages;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getAmountPages() {
        return amountPages;
    }

    public int getISBN() {
        return ISBN;
    }
}




