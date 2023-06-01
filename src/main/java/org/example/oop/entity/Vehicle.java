package org.example.oop.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehicle {
    private String name;
    private int numberOfWheel;
    private int publishingYear;

    public String information() {
        return name + " " + numberOfWheel + " " + publishingYear;
    }
    
    public String information(String name){
        System.out.println(name);
        return name + " " + numberOfWheel + " " + publishingYear;
    }
}
