package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Değişken isimlendirmeleri javada camelCase olarak yazılır.
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade Süresi";
        System.out.println(ortaMetin);

        int vade = 12;
        double dolarDun = 18.15;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        }
        else if(dolarBugun > dolarDun){
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else{
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan Alanlar"};

        for (int i = 0; i< krediler.length; i++){
            System.out.println(krediler[i]);
        }



    }
}