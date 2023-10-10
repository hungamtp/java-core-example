package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println(streamBuilder.collect(Collectors.toList()).size());
        System.out.println("");
        Set<String> hung = new HashSet<>();
        hung.add("hung");
        hung.contains("hung");
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("hung");

    }
}
