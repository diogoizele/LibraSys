package com.diogoizele.java;

import com.diogoizele.java.controllers.BookController;
import com.diogoizele.java.models.Book;

public class Application {

    public static void main(String[] args) {
        final BookController bookController = new BookController();

        bookController.addBook("O Senhor dos Anéis - A Sociedade do Anél", "J.R.R. Tolkien");

        bookController.listAllBooks();

    }
}
