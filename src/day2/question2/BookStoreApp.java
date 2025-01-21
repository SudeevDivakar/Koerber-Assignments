package day2.question2;
import java.util.ArrayList;
import java.util.Collections;

/*
Create a book store application which will help a book store to keep the record of its books. For
each book, the application will have the Book Title, Book Author, Book ISBN along with the
number of copies for each book. The system will allow you to display all books, order new/existing
books and sell books. With sell or order of existing books, number of copies will decrease/increase.
With order of new book, a new book entry will be added to the system.
 */

// Test file for Question 2

public class BookStoreApp {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        Book book1 = new Book("b1", "a1", "i1", 10);
        Book book2 = new Book("b2", "a2", "i2", 10);
        Book book3 = new Book("b3", "a3", "i3", 10);
        Book book4 = new Book("b4", "a4", "i4", 10);
        Book book5 = new Book("b5", "a5", "i5", 10);
        Book book6 = new Book("b6", "a6", "i6", 10);
        Book book7 = new Book("b7", "a7", "i7", 10);
        Book book8 = new Book("b8", "a8", "i8", 10);
        Book book9 = new Book("b9", "a9", "i9", 10);
        Book book10 = new Book("b10", "a10", "i10", 10);

        Book[] tempBooks = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        Collections.addAll(books, tempBooks);

        BookStore bookStore1 = new BookStore(books);

        System.out.println("Initial Books Data");
        bookStore1.display();
        System.out.println("*************");

        System.out.println("Selling 6 copies of book with name b1");
        bookStore1.sell("b1", 6);   // Enough books to sell
        bookStore1.display();
        System.out.println("*************");

        System.out.println("Trying to sell 6 copies of book b1 but only 4 copies are present");
        bookStore1.sell("b1", 6);   // Not enough books to sell
        bookStore1.display();
        System.out.println("*************");

        System.out.println("Ordering 20 books with isbn code i1");
        bookStore1.order("i1", 20);
        bookStore1.display();
        System.out.println("*************");
    }
}
