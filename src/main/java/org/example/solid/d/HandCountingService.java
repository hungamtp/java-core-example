package org.example.solid.d;

public class HandCountingService implements CountingService{
    @Override
    public void count() {
        System.out.println("Calculating by hand");
    }
}
