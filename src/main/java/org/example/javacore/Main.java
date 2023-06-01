package org.example.javacore;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // convert a List to Map
        List<String> words = Arrays.asList(
                "One" , "two" , "hi" , "hello"
        );

        Map<String , Integer> map = words.stream().collect(Collectors.toMap(String::toString , String::length));
        System.out.println("");
    }
}
