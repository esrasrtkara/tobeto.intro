package org.example.inheritance;

//somut işlemlerde barındırabilen soyutlama da yapabilen yapılardır
//new leme yapılamaz
public abstract class Animals {

    public abstract void makeSound();


    public void eat(){
        System.out.println("Animal eating");
    }
    public void breathe(){
        System.out.println("Animal breathing");
    }
}
