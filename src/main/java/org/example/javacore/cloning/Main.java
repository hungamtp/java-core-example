package org.example.javacore.cloning;

import org.apache.commons.lang3.SerializationUtils;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student hung = Student.builder()
                .name("Hung")
                .className("1461")
                .build();
        Student tung = (Student) hung.clone();
        hung.toString();
        tung.toString();
        tung.setName("Huy");
        
        System.out.println(hung == tung);

        hung.toString();
        tung.toString();
        System.out.println(hung == hung);
    }
}
