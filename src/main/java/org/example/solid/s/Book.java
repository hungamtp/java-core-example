package org.example.solid.s;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private int quantities;

    //bad design
    void addTagToName(String name){
        System.out.println(new StringBuilder(name).append(" is the best"));
    }
}
