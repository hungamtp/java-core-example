package org.example.oop.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car extends Vehicle{
    private boolean selfDrive;
    
}
