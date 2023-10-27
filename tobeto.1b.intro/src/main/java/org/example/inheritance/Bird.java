package org.example.inheritance;

public class Bird extends Animals {

    public void fly(){

    }

    @Override
    public void makeSound() {
        System.out.println("cik cik");
    }
}
