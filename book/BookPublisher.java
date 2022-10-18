package com.solid.book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

interface publisherInterface{
    void printToFile();
}

class publisher_book implements publisherInterface{
    public void printToFile(String title, List<String> pages) {
        Book book = new Book(title, pages);
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(book.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = book.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, book.getCurrentPage());
                    isEven = true;
                }
            } while (book.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }
}

public class BookPublisher {
    public static void main(String[] args) {
        // Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        // book.printToFile();
        publisher_book book = new publisher_book();
        book.printToFile("Tyland", List.of("I", "moved", "here", "recently", "too"));
    }
}
