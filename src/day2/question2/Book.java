package day2.question2;

/*
Create a book store application which will help a book store to keep the record of its books. For
each book, the application will have the Book Title, Book Author, Book ISBN along with the
number of copies for each book. The system will allow you to display all books, order new/existing
books and sell books. With sell or order of existing books, number of copies will decrease/increase.
With order of new book, a new book entry will be added to the system.
 */

public class Book {
    private String bookTitle;
    private String author;
    private String ISBN;
    private int numOfCopies;

    public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
        this.numOfCopies = numOfCopies;
    }

    public void display() {
        System.out.println(bookTitle + " - " + author + " - " + ISBN + " - " + numOfCopies);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookCount() {
        return numOfCopies;
    }

    public String getISBN() {
        return ISBN;
    }

    public void sell(int copies) {
        numOfCopies -= copies;
    }

    public void order(int copies) {
        numOfCopies += copies;
    }
}
