package org.example.solid.o;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends People{
    private String level;
    @Builder
    public Doctor(String name, int age, String level) {
        super(name, age);
        this.level = level;
    }
}
