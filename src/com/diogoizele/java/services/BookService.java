package com.diogoizele.java.services;

import com.diogoizele.java.models.Book;
import com.diogoizele.java.repositories.BookRepository;
import com.diogoizele.java.repositories.BookRepositoryImpl;
import java.util.List;

import static com.diogoizele.java.utils.Utils.generateId;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepositoryImpl();
    }

    public Book addBook(final String title, final String author) {

        String id;

        do {
            id = generateId();
        } while (idExists(id));

        final Book book = new Book(title, author, id, true);

        bookRepository.save(book);

        return book;
    }

    private boolean idExists(final String id) {
        return bookRepository.getAll().stream()
                .anyMatch(book -> book.getIsbn().equals(id));
    }

    public List<Book> listAllBooks() {
        return bookRepository.getAll();
    }
}
