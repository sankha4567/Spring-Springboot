package org.sankha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
   @Autowired

    private Computer computer;



    private int age;
    public Dev(){
        System.out.println("Dev Mode....");
    }
    public Computer getComputer(){
        return computer;
    }
    public void setComputer(Computer computer){
        this.computer=computer;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void build(){
        computer.compile();
        System.out.println("Hello world... in Dev Mode");
    }


}
