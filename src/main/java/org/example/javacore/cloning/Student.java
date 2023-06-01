package org.example.javacore.cloning;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Serializable, Cloneable , Comparable<Student>{
    private String name;
    private String className;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        
        return obj;
    }

    @Override
    public String toString() {
        System.out.println("Name : " + name + "Class : " + className);
        return super.toString();
    }

    @Override
    public int compareTo(Student o) {
        if(name.charAt(0) > o.getName().charAt(0)){
            return 1;
        }else if(name.charAt(0) == o.getName().charAt(0)){
            return 0;
        }else{
            return -1;
        }
    }
}
