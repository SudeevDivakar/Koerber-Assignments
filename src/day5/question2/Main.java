package day5.question2;

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

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Defining all books
        Book b1 = new Book("Harry Potter 1", 100, "J.K Rowling");
        Book b2 = new Book("Harry Potter 2", 110, "J.K Rowling");
        Book b3 = new Book("Harry Potter 3", 120, "J.K Rowling");
        Book b4 = new Book("Harry Potter 4", 130, "J.K Rowling");
        Book b5 = new Book("Harry Potter 5", 140, "J.K Rowling");
        Book b6 = new Book("Harry Potter 5", 140, "S.K Rowling");
        Book b7 = new Book("Java in depth", 200, "Sudeev");
        Book b8 = new Book("Rich dad, poor dad", 173, "Robert Kiyosaki");
        Book b9 = new Book("Atomic Habits", 165, "James Clear");
        Book b10 = new Book("Java in depth", 200, "Aathrey");

        Book[] tempBooks = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};
        Collections.addAll(books, tempBooks);

        // Creating a book collection
        BookCollection bookCollection1 = new BookCollection("Sudeev Divakar", books);
        Book testBook1 = new Book("Java in depth", 200, "Sudeev");
        Book testBook2 = new Book("Percy Jackson", 400, "Rick Riordan");

        //Check if book is there in collection
        bookCollection1.hasBook(testBook1);
        bookCollection1.hasBook(testBook2);
        System.out.println("************************");
        System.out.println();

        // Before and After Sorting
        System.out.println("ArrayList before Sorting");
        System.out.println(bookCollection1.toString());
        System.out.println("************************");
        System.out.println("ArrayList after Sorting");
        bookCollection1.sort(books);
        System.out.println(bookCollection1.toString());
    }
}
