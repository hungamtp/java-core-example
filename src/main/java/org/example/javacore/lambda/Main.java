package org.example.javacore.lambda;

import org.example.javacore.cloning.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Arrays.stream() method only works for primitive arrays of int[], long[], and double[] type, 
        // and returns IntStream, LongStream and DoubleStream respectively.


        // Creating an Stream
        Stream stream = Stream.of("Geeks", "for", "Geeks");

        // Displaying the sequential ordered stream
        stream.forEach(str -> System.out.print(str + " "));

        // Creating a String array
        String[] strarr = { "Geeks", "for", "Geeks" };

        // Using Arrays.stream() to convert
        // array into Stream
        Stream<String> stream1 = Arrays.stream(strarr);

        // Displaying elements in Stream
        stream1.forEach(str -> System.out.print(str + " "));

        // Creating an integer array
        int arr[] = { 1, 2, 3, 4, 5 };

        // --------- Using Arrays.stream() ---------

        // to convert int array into Stream
        IntStream intStream = Arrays.stream(arr);

        // Displaying elements in Stream
        intStream.forEach(str -> System.out.print(str + " "));

        // --------- Using Stream.of() ---------

        // to convert int array into Stream
        Stream<int[]> stream2 = Stream.of(arr);

        // ***** Flattening of Stream<int[]> into IntStream *****

        // flattenning Stream<int[]> into IntStream
        // using flatMapToInt()
        IntStream intStreamNew = stream2.flatMapToInt(Arrays::stream);

        // Displaying elements in IntStream
        intStreamNew.forEach(str -> System.out.print(str + " "));

        List<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.forEach(student -> students.add(new Student()));
        students.forEach(Student::toString);
        students.stream().forEach(student -> student.setName("hung"));
        students.forEach(Student::toString);


        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    interface StringFunction {
        String run(String str);
    }
}
