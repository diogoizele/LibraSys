package main.java.com.diogoizele.repositories;

import main.java.com.diogoizele.exceptions.NotFoundException;
import main.java.com.diogoizele.models.Book;

import java.util.*;

public class BookRepositoryImpl implements BookRepository {

    private final Map<String, Book> books = new HashMap<>();

    @Override
    public List<Book> getAll() {
        return books.values().stream().toList();
    }

    @Override
    public Book getByIsbn(final String isbn) throws NotFoundException {

        final Book book = books.get(isbn);

        if (Objects.isNull(book)) {
            throw new NotFoundException("Livro de ISBN: " + isbn + " não encontrado.");
        }

        return book;
    }

    @Override
    public List<Book> getByName(String name) {
        return null;
    }

    @Override
    public Book save(Book book) {
        return books.put(book.getIsbn(), book);
    }

    @Override
    public void deleteByIsbn(String isbn) {
        books.remove(isbn);
    }

}
