package org.example.solid.o;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SurgeryDoctor extends Doctor{
    private String bodyPart;
    
    // SurgeryDoctor have only one skill for specific part of body so we need one more field
    // Should add one field in inheritor class not modify Doctor class
}
