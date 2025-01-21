package day2.question2;
import java.util.ArrayList;
import java.util.Scanner;

/*
Create a book store application which will help a book store to keep the record of its books. For
each book, the application will have the Book Title, Book Author, Book ISBN along with the
number of copies for each book. The system will allow you to display all books, order new/existing
books and sell books. With sell or order of existing books, number of copies will decrease/increase.
With order of new book, a new book entry will be added to the system.
 */

public class BookStore {
    private ArrayList<Book> books;

    public BookStore(ArrayList<Book> books) {
        this.books = books;
    }

    public void sell(String bookTitle, int noOfCopies) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            Book currBook = books.get(i);
            if (currBook.getBookTitle().equalsIgnoreCase(bookTitle)) {
                found = true;
                if (currBook.getBookCount() >= noOfCopies) {
                    currBook.sell(noOfCopies);
                    System.out.println("Books sold");
                } else {
                    System.out.println("Not enough books to sell");
                }
            }
        }
        if (!found) {
            System.out.println("Book not Found");
        }
    }

    public void order(String isbn, int noOfCopies) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            Book currBook = books.get(i);
            if (currBook.getISBN().equalsIgnoreCase(isbn)) {
                found = true;
                currBook.order(noOfCopies);
                System.out.println("Books Ordered!");
            }
        }
        if (!found) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Book Name");
            String name = sc.nextLine();
            System.out.println("Enter Author Name");
            String author = sc.nextLine();

            Book newBook = new Book(name, author, isbn, noOfCopies);
            books.add(newBook);
            System.out.println("Books Ordered!");
        }
    }

    public void display() {
        for (Book book : books) {
            book.display();
        }
    }
}
