package org.example;

import java.util.Scanner;

//1-Write a Java program to check if the entered number is Armstrong number?
public class ArmstrongNumber {
    public static void main(String[] args) {
        isArmstrongSayisi(153);
    }
    public static void isArmstrongSayisi(int sayi) {
        int toplam = 0;
        int gecici = sayi;
        String basamakSayisi = Integer.toString(sayi);
        // 153
        while (gecici > 0) {
            int basamak = gecici % 10;
            toplam += Math.pow(basamak, basamakSayisi.length());
            gecici /= 10;
        }
        if (toplam == sayi)
            System.out.println(toplam + " bir armstrong sayıdır.");
        else
            System.out.println(toplam + " armstrong sayı değildir.");
    }
}
