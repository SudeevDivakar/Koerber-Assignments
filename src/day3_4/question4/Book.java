package day3_4.question4;

/*
Write an application to read a file data.txt containing data like (actually it is a record of an book consisting of
id, isbn, title, author and price)
file contain data like
books.txt
121:A234:java:raj:456
102:S234:c++:ekta:567
1. read the file and populate records in an LinkedList of books
2. write BookApp
3. write method searchBook(book id)
4. write method sellBook(String isbn, int noOfCopies)
5. write method purchageBook(String isbn,int noOfCopies)
6. if Not sufficient book throw exception NotSufficientBookException
 */

public class Book {
    private int id;
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int noOfCopies;

    public Book(int id, String isbn, String title, String author, double price, int noOfCopies) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.noOfCopies = noOfCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(id)
                .append(" - ")
                .append(isbn)
                .append(" - ")
                .append(title)
                .append(" - ")
                .append(author)
                .append(" - ")
                .append(price)
                .append(" - ")
                .append(noOfCopies)
                .toString();
    }
}
