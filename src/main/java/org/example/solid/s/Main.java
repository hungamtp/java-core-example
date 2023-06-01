package org.example.solid.s;

import lombok.RequiredArgsConstructor;

public class Main {
    public static void main(String[] args) {
        BookPrinter bookPrinter = new BookPrinter();
        Book newBook = new Book("Dark people point" , 12);
        bookPrinter.addTagToName(newBook.getName());
        System.out.println(10 >> 1);
        System.out.println(10 >> 2);
        System.out.println(10 >> 3);
    }
}
