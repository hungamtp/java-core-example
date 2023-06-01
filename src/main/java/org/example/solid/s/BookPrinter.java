package org.example.solid.s;

public class BookPrinter {
    void addTagToName(String name){
        System.out.println(new StringBuilder(name).append(" is the best"));
    }
}
