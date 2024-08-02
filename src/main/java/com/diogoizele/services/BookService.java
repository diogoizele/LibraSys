package main.java.com.diogoizele.services;

import main.java.com.diogoizele.models.Book;
import main.java.com.diogoizele.utils.Utils;
import main.java.com.diogoizele.repositories.BookRepository;
import main.java.com.diogoizele.repositories.BookRepositoryImpl;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepositoryImpl();
    }

    public Book addBook(final String title, final String author) {

        String id;

        do {
            id = Utils.generateId();
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
