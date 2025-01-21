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

public class NotSufficientBooksException extends Exception {
    public NotSufficientBooksException() {
        super("Sufficient Number of Books not Present");
    }
}
