package org.sankha;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Constructor");
    }

    public void compile(){
        System.out.println("hey i am compilling... in Laptop");
    }
}
