package Day5.Question2;

import java.util.ArrayList;
import java.util.Collections;

/*
Create a class BookCollection which contains:
1. the owner's name and an array of books that the owner has,
2. toString( ) that outputs all the books in the BookCollection in a nice format.
3. a method hasBook(Book b) which checks if the book b is contained in the array (we consider two books the same
if they have the same title and author).
4. a method sort() that sorts the books in the array by the lexicographical order of the book title, and author.
Create your own BookCollection and check if you own a particular book:"Java in depth". Sort the BookCollection
and output the BookCollection.
 */

public class BookCollection {
    private String ownerName;
    private ArrayList<Book> books;

    public BookCollection(String ownerName, ArrayList<Book> books) {
        this.ownerName = ownerName;
        this.books = books;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.getTitle());
            sb.append(" - ");
            sb.append(book.getAuthor());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hasBook(Book b) {
        boolean found = false;
        for (Book book : books) {
            if (b.getTitle().compareTo(book.getTitle()) == 0) {
                if (b.getAuthor().compareTo(book.getAuthor()) == 0) {
                    found = true;
                    System.out.println("Book is found in collection :D");
                }
            }
        }
        if(!found) {
            System.out.println("Book is not found in collection :(");
        }
    }

    public void sort(ArrayList<Book> books) {
        Collections.sort(books, new BookSortByAuthor());
        this.books = books;
    }
}
