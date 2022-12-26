package org.webp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookEJBTest {

    private BookEJB bookEJB = new BookEJB();

    @Test
    public void testCreateBook() {
        Book book = new Book();
        book.setBookId(1L);
        book.setName("Satranç");
        book.setCategory("Kurgu");
        book.setPrice(40);
        book.set(1L);
        bookEJB.createBook(book);
        Book foundBook = bookEJB.findBookById(1L);
        assertEquals(book, foundBook);
    }

    @Test
    public void testUpdateBook() {
        Book book = new Book();
        book.setBookId(1L);
        book.setName("Satranç");
        book.setCategory("Kurgu");
        book.setPrice(40);
        bookEJB.createBook(book);
        book.setPrice(70);
        bookEJB.updateBook(book);
        Book foundBook = bookEJB.findBookById(1L);
        assertEquals(70, foundBook.getPrice());
    }

    @Test
    public void testDeleteBook() {
        Book book = new Book();
        book.setBookId(1L);
        book.setName("Satranç");
        book.setCategory("Kurgu");
        book.setPrice(40);
        book.setsellerCompanyID(1L);
        bookEJB.createBook(book);
        bookEJB.deleteBook(1L);
        Book foundBook = bookEJB.findBookById(1L);
        assertNull(foundBook);
    }
}

