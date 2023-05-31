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
}
