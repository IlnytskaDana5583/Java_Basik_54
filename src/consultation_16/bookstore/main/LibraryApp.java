package consultation_16.bookstore.main;

import consultation_16.bookstore.main.controller.BookController;


public class LibraryApp {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
    }
}

