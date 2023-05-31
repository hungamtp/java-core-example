package org.example;

import org.example.oop.entity.Car;
import org.example.oop.entity.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSelfDrive(true);
        car.setName("i9");
        System.out.println(car.information());
        
        // upcasting
        // child to parent
        Vehicle vehicle = car;
        System.out.println(vehicle.information());
        
        // downcasting 
        // parent to child
        Vehicle vehicle1 = new Car();

    }
}