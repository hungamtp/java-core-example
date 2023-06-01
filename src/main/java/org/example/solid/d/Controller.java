package org.example.solid.d;

public class Controller {
    
    private final CountingService countingService;
    
    
    // when we need to use another way to counting just need to use implementation of CountingService interface
    public Controller(ComputerCountingService countingService){
        this.countingService = countingService;
    }
    
}
