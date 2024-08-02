package main.java.com.diogoizele.controllers;

import main.java.com.diogoizele.models.Book;
import main.java.com.diogoizele.services.BookService;

public class BookController {

    final private BookService bookService;

    public BookController() {
        this.bookService = new BookService();
    }

    public Book addBook(final String title, final String author) {
        final Book book = bookService.addBook(title, author);
        System.out.println("Livro adicionado com sucesso: " + book);
        return book;
    }

    public void listAllBooks() {
        System.out.println("Listagem completa de livros: ");
        bookService.listAllBooks().forEach(System.out::println);
    }
}
