package org.example;
//Write a Java function to print first 100 numbers in Fibonacci series?
public class Fibonacci {
    public static void main(String[] args) {

        long[] fibonacci = new long[100] ;
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        System.out.print(fibonacci[0]+","+fibonacci[1]);
        for (int i=2; i<100;i++){
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
            System.out.print(","+fibonacci[i]);
        }

    }
}
