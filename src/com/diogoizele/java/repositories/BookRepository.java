package com.diogoizele.java.repositories;

import com.diogoizele.java.exceptions.NotFoundException;
import com.diogoizele.java.models.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getAll();

    Book getByIsbn(final String isbn) throws NotFoundException;

    List<Book> getByName(final String name) throws NotFoundException;

    Book save(final Book book);

    void deleteByIsbn(final String isbn) throws NotFoundException;
}
