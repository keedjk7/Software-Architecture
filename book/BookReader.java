package com.solid.book;


import java.util.List;

interface Interface{
    void printToScreen();
}

class sample_book implements Interface{
    public void printToScreen(String title, List<String> pages) {
        Book book = new Book(title,pages);
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}

public class BookReader {
    public static void main(String[] args) {
        // Book book = new sample_book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        sample_book book = new sample_book();
        book.printToScreen("Tyland", List.of("I", "moved", "here", "recently", "too"));
    }
}

