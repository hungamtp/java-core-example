package org.example.solid.i;

public class Student implements StudyInterface{
    private String className;

    @Override
    public void goToSchool() {
        System.out.println("Ride a bike");
    }

    @Override
    public void study() {
        System.out.println("Learn math in " + className);
    }
}
