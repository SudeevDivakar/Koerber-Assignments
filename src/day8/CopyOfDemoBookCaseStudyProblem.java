package day8;

import java.util.*;
import java.util.stream.Collectors;


public class CopyOfDemoBookCaseStudyProblem {
    public static void main(String[] args) {
        List<Book> allBooks = loadAllBooks();

        // 1. Find books with more than 400 pages
        System.out.println("Books with more than 400 Pages:");
        allBooks.stream()
            .filter(b -> b.getPages() > 400)
                .forEach(System.out::println);
        System.out.println("******************************\n");


        // 2. Find all books that are java books and more than 400 pages
        System.out.println("Java Books with more than 400 pages:");
        allBooks.stream()
            .filter(b -> b.getPages() > 400 && b.getSubject() == Subject.JAVA)
                .forEach(System.out::println);
        System.out.println("******************************\n");


        // 3. We need the top three longest books
        System.out.println("Top three longest books:");
        allBooks.stream()
            .sorted(Comparator.comparing(Book::getPages).reversed())
                .limit(3)
                    .forEach(System.out::println);
        System.out.println("******************************\n");


        // 4. We need from the fourth to the last longest books
        System.out.println("Fourth to last longest books:");
        allBooks.stream()
            .sorted((b1, b2) -> Integer.compare(b2.getPages(), b1.getPages()))
                .skip(3)
                    .forEach(System.out::println);
        System.out.println("******************************\n");


        // 5. We need to get all the publishing years
        System.out.println("Getting all distinct publishing years:");
        allBooks.stream()
            .map(Book::getYear)
                .distinct()
                    .forEach(System.out::println);
        System.out.println("******************************\n");


        // 6. We need all the authors names who have written a book
        System.out.println("All authors names who have written a book:");
        allBooks.stream()
            .flatMap(b -> b.getAuthors().stream())
                .map(Author::toString)
                    .distinct()
                        .forEach(System.out::println);
        System.out.println("******************************\n");


        // We need all the origin countries of the authors
        System.out.println("Origin Countries of All Authors:");
        allBooks.stream()
            .flatMap(b -> b.getAuthors().stream())
                .map(a -> new StringBuilder(a.getName()).append(" ").append(a.getLastname()).append(" - '").append(a.getCountry()).append("'").toString())
                    .distinct()
                        .forEach(System.out::println);
        System.out.println("******************************\n");


        // We want the most recent published book.
        System.out.println("Most recently published book:");
        allBooks.stream()
            .max(Comparator.comparing(Book::getYear))
                .ifPresent(System.out::println);
        System.out.println("******************************\n");


        // We want to know if all the books are written by more than one author
        System.out.println("We want to know if all the books are written by more than one author:");
        boolean check = allBooks.stream()
            .allMatch(b -> b.getAuthors().size() > 1);
        if(check){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("******************************\n");


        // We want one of the books written by more than one author. (findAny)
        System.out.println("Find any book with more than one author:");
        allBooks.stream()
            .filter(b -> b.getAuthors().size() > 1)
                .findAny()
                    .ifPresent(System.out::println);
        System.out.println("******************************\n");


        // We want the total number of pages published.
        System.out.println("Total number of pages published:");
        System.out.println(allBooks.stream()
            .parallel()
                .mapToInt(Book::getPages)
                    .reduce(0, (x, y) -> x + y));
        System.out.println("******************************\n");


        // We want to know how many pages the longest book has.
        System.out.println("Number of Pages in the longest book:");
        allBooks.stream()
            .max(Comparator.comparing(Book::getPages))
                .ifPresent(b -> System.out.println(b.getPages()));
        System.out.println("******************************\n");


        // We want the average number of pages of the books
        System.out.println("Average number of pages:");
        allBooks.stream()
            .mapToInt(Book::getPages)
                .average()
                    .ifPresent(System.out::println);
        System.out.println("******************************\n");


        // We want all the titles of the books
        System.out.println("Titles of all the books:");
        allBooks.stream()
            .map(Book::getTitle)
                .forEach(System.out::println);
        System.out.println("******************************\n");


        // We want the book with the higher number of authors?
        System.out.println("Book with the highest number of authors:");
        allBooks.stream()
            .max(Comparator.comparing(b -> b.getAuthors().size()))
                .ifPresent(System.out::println);
        System.out.println("******************************\n");


        // We want a Map of book per year.
        System.out.println("Map of books per year:");
        allBooks.stream()
            .collect(Collectors.groupingBy(Book::getYear))
                .forEach((key, value) -> {
                        String books = value.stream()
                                        .map(Book::toString)
                                            .collect(Collectors.joining(", "));
                        System.out.println(new StringBuilder()
                            .append(key)
                                .append(" - ")
                                    .append(books));
                    }
                );
        System.out.println("******************************\n");


        // We want to count how many books are published per year.
        System.out.println("Counting how many books are published per year:");
        allBooks.stream()
            .collect(Collectors.groupingBy(Book::getYear))
                .forEach((key, value) -> System.out.println(new StringBuilder()
                    .append(key)
                        .append(": ")
                            .append(value.size()).toString()));
        System.out.println("******************************\n");
    }

    private static List<Book> loadAllBooks() {
        List<Book> books = new ArrayList<Book>();
        List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
                new Author("ekta", "gupta", "in"));

        List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

        List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
                new Author("keshav", "gupta", "us"));

        books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
        books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
        books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));
        books.add(new Book("oracle", authors2, 350, Subject.ORACLE, 2008, "1295"));

        return books;
    }

}
