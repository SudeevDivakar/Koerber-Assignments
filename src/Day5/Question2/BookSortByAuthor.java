package Day5.Question2;

import java.util.Comparator;

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

public class BookSortByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        if (result == 0) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
        else {
            return result;
        }
    }
}
