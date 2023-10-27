package org.example.inheritance;
//Fish => Subclass
//Animals => Superclass
public class Fish extends Animals {

    public void  swim(){

    }

    @Override // ana classdaki bu methodu üzerine yaz.
    public void eat() {
        //super => Kalıtım aldığım class'ı ifade eder.
        System.out.println("Fish eating");
        //super.eat();
    }
}
