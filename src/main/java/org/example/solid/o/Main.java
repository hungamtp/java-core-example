package org.example.solid.o;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = Doctor.builder()
                .name("Hung")
                .age(23)
                .level("Sen")
                .build();
    }
}
