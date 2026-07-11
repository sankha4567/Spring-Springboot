package org.sankha;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("johnny")

public class Dekstop implements Computer{
    public Dekstop(){System.out.println("Dekstop constructor");

    }
    public void compile(){
        System.out.println("Compilling in Dekstop");
    }
}
