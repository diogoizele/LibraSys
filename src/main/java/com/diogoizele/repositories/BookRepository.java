package main.java.com.diogoizele.repositories;

import main.java.com.diogoizele.exceptions.NotFoundException;
import main.java.com.diogoizele.models.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getAll();

    Book getByIsbn(final String isbn) throws NotFoundException;

    List<Book> getByName(final String name) throws NotFoundException;

    Book save(final Book book);

    void deleteByIsbn(final String isbn) throws NotFoundException;
}
