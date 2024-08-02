package main.java.com.diogoizele;

import main.java.com.diogoizele.controllers.BookController;

public class Application {

    public static void main(String[] args) {
        final BookController bookController = new BookController();

        bookController.addBook("O Senhor dos Anéis - A Sociedade do Anél", "J.R.R. Tolkien");

        bookController.listAllBooks();

    }
}
