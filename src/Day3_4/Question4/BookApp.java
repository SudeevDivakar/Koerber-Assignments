package Day3_4.Question4;

import java.util.List;

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

public class BookApp {
    private List<Book> books;

    public BookApp(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBook(int id) {
        try {
            for (Book book : books) {
                if (book.getId() == id) {
                    return book;
                }
            }
            throw new BookNotFoundException();
        }
        catch (BookNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void sellBook(String isbn, int noOfCopies) {
        try {
            Book book = findBookByISBN(isbn);
            if (book != null) {
                if (book.getNoOfCopies() >= noOfCopies) {
                    book.setNoOfCopies(book.getNoOfCopies() - noOfCopies);
                    System.out.println("Books sold successfully");
                    System.out.println("New Info:");
                    System.out.println(book.toString());
                }
                else {
                    throw new NotSufficientBooksException();
                }
            }
            else {
                throw new BookNotFoundException();
            }
        }
        catch (NotSufficientBooksException | BookNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void purchaseBook(String isbn, int noOfCopies) {
        try {
            Book book = findBookByISBN(isbn);
            if (book != null) {
                book.setNoOfCopies(book.getNoOfCopies() + noOfCopies);
                System.out.println("Books purchased successfully");
                System.out.println("New Info:");
                System.out.println(book.toString());
            }
            else{
                throw new BookNotFoundException();
            }
        }
        catch (BookNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}