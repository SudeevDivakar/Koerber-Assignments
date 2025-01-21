package day3_4.question4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
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

public class Main {
    public static void sellBook(String isbn, int noOfCopies, BookApp bookApp) {
        System.out.println(new StringBuilder().append("Selling Book ").append(isbn).toString());
        bookApp.sellBook(isbn, noOfCopies);
        System.out.println();
    }

    public static void purchaseBook(String isbn, int noOfCopies, BookApp bookApp) {
        System.out.println(new StringBuilder().append("Trying to Purchase Book ").append(isbn).toString());
        bookApp.purchaseBook(isbn, noOfCopies);
        System.out.println();
    }

    public static void searchBook(int id, BookApp bookApp){
        System.out.println(new StringBuilder().append("Searching for Book with ID: ").append(id).toString());
        Book book = bookApp.searchBook(id);
        if (book != null) {
            System.out.println(book.toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day3_4\\Question4\\books.txt"))) {
            //Reading File and Strong books
            String line;
            while((line = br.readLine()) != null) {
                String[] words = line.split(":");
                books.add(new Book(Integer.parseInt(words[0]), words[1], words[2], words[3], Double.parseDouble(words[4]), Integer.parseInt(words[5])));
            }

            //Create BookApp
            BookApp bookApp1 = new BookApp(books);

            //Searching valid book
            searchBook(104, bookApp1);
            //Search invalid book
            searchBook(151, bookApp1);

            System.out.println("********************");

            //Sell book functionality
            sellBook("G423", 15, bookApp1); //Not enough copies to sell
            sellBook("G423", 5, bookApp1); //Sufficient copies to sell
            sellBook("G523", 15, bookApp1); //Invalid book
            System.out.println("********************");

            //Purchase book functionality
            purchaseBook("G423", 26, bookApp1);  //Valid book
            purchaseBook("G523", 20, bookApp1); //Invalid book
            System.out.println("********************");
        }
        catch (IOException ex) {
            System.out.println("Error in reading file");
        }
    }
}
