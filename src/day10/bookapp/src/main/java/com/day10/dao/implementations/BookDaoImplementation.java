package com.day10.dao.implementations;

import com.day10.dao.Book;
import com.day10.dao.BookDao;
import com.day10.exceptions.DaoException;
import com.day10.factory.ConnectionFactory;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class BookDaoImplementation implements BookDao {
    private Connection conn;

    public BookDaoImplementation() {
        conn = ConnectionFactory.getConnection();
        if (conn == null) {
            throw new DaoException("Connection cannot be established");
        }
    }


    @Override
    public List<Book> getAllBooks() throws DaoException {
        List<Book> result = new LinkedList<>();
        try (PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM books;")) {
            ResultSet res = pstmt.executeQuery();
            while (res.next()) {
                result.add(new Book(res.getInt("id"), res.getString("isbn"), res.getString("title") ,res.getString("author"), res.getDouble("price")));
            }
            if (result.isEmpty()) {
                throw new DaoException("No Books in Database");
            }
            return result;
        }
        catch (SQLException ex) {
            throw new DaoException("Error Selecting All Books");
        }
    }

    @Override
    public Book addBook(Book book) throws DaoException {
        try (PreparedStatement pstmt = conn.prepareStatement("INSERT INTO books (isbn, title, author, price) values (?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setDouble(4, book.getPrice());
            System.out.println("HEHE");
            int res = pstmt.executeUpdate();
            if (res > 0) {
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        System.out.println("LOL");
                        book.setId(rs.getInt(1));
                        System.out.println("LMAO");
                        return book;
                    } else {
                        throw new DaoException("No ID generated for the new customer.");
                    }
                }
            }
            else {
                throw new SQLException();
            }
        }
        catch (SQLException ex) {
            throw new DaoException("Error while adding a book");
        }
    }

    @Override
    public void deleteBook(int id) throws DaoException {
        try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM books WHERE id = ?;")) {
            pstmt.setInt(1, id);
            int res = pstmt.executeUpdate();
            if (res > 0) {
                System.out.println("Successfully Deleted Book");    // Will improve in assignment 11 using log4j
            }
            else {
                throw new DaoException("Book not in Database");
            }
        }
        catch (SQLException ex) {
            throw new DaoException("Error in Deleting Book");
        }
    }

    @Override
    public void updateBook(int id, Book book) throws DaoException {
        try (PreparedStatement pstmt = conn.prepareStatement("UPDATE books SET isbn = ?, title = ?, author = ?, price = ? where id = ?;")) {
            pstmt.setString(1, book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setDouble(4, book.getPrice());
            pstmt.setInt(5, id);

            int res = pstmt.executeUpdate();
            if (res > 0) {
                System.out.println("Successfully Updated Book");    // Will improve in assignment 11 using log4j
            }
            else {
                throw new DaoException("Book not in Database");
            }
        }
        catch (SQLException ex) {
            throw new DaoException("Error in Updating Book");
        }
    }

    @Override
    public Book getBookById(int id) throws DaoException {
        try (PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM books WHERE id = ?;")) {
            pstmt.setInt(1, id);
            ResultSet res = pstmt.executeQuery();
            if (res.next()) {
                return new Book(id, res.getString("isbn"), res.getString("title"), res.getString("author"), res.getDouble("price"));
            }
            else {
                throw new DaoException("Book not Found in Database");
            }
        }
        catch (SQLException ex) {
            throw new DaoException("Error in Getting Single Book");
        }
    }
}
