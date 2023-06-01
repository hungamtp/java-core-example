package org.example.solid.i;

public class Teacher implements WorkingInterface{
    private String subject;

    @Override
    public void goToSchool() {
        System.out.println("Ride a car");
    }

    @Override
    public void teaching() {
        System.out.println("Teaching" + subject);
    }
}
