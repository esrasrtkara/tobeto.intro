package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main
{ /* Main classının scope başlangıcı */
    public static int staticNumber = 0;
    public static void main(String[] args)
    { /* Main metotunun scope başlangıcı */
        System.out.println(staticNumber);
        // Programlama
        // Elimizdeki ham verinin yönetilerek yazılım ürününe çevilirmesi.

        // Programming Concepts

        // Variables - Değişkenler

        // type-safe
        String text = "Merhaba, Tobeto";
        Integer number = 10;
        int number2 = 15;
        // RAM'de tutuluyolar.
        System.out.println(text);
        System.out.println(number);
        System.out.println(number2);

        List<Integer> numbers =  new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        // Scope => Kapsam,Alan

        if(1==2)
        {
            System.out.println(staticNumber); // main.class
            System.out.println(numbers); // main method
            String text2 = "Merhaba"; // if scope
            if(2==2){
                String text3 = "Merhaba 3";
            }
        }
        // main.class
        // main.method
        else
        {
            System.out.println("Koşul yanlış");
        }

        // Şart Blokları

        // içerisine kabul ettiği koşul ile bu koşulun sağlanıp sağlanamama durumuna göre
        // bir kod çalıştıran yapılar..

        // == != > < >= <=
        int number3=4;
        int number4=6;
        if(number3 > number4) // boolean => true,false
        {
            System.out.println("Number 3 daha büyük");
        }
        else if(number3 > 5){
            System.out.println("Number 3 5'ten büyük");
        }
        // **************************************** //
        if(number3==number4)
        {
            System.out.println("Number eşit");
        }
        else
        {
            System.out.println("Number 3 daha küçük");
        }

        // ** => Her if bloğundan sadece bir scope çalıştırılır

        if(number3 > 10){
            // BLA BLA..
        }


        char state = 'A';

        switch(state){ // state isimli değişkeni switch et
            case 'A': // değer A olduğunda
                System.out.println("A durumu");
                break;
            case 'B': // B olduğunda
                System.out.println("B durumu");
                break;
            case 'C': // C olduğunda
                System.out.println("C durumu");
                break;
            default:
                System.out.println("Bilinmeyen durumlar");
                break;
        }

        //Primitive-Referance tip
        //oop

        int a = 5;
        int b = a;
        b+=1;
        System.out.println(a);
        System.out.println(b);

        String[] names = {"Halit","Engin"};

        // String[] names2 = names;
        //Clone  aynı değere sahip başka adresli liste oluşturmak için kullanılır.
        String[] names2 = names.clone();
        // String[] names2 = Arrays.copyOf(names,names.length);
        names2[0] = "Enes";

        System.out.println(names[0]);
        System.out.println(names2[0]);

        //iterasyon
        //index
        for (int i = 0;i < names2.length; i++){
            System.out.println(names2[i]);
        }
        //names2 içindeki her bir elemanı iterasyona uğrat
        //her elemana name takma adını ver.
        for (String name : names2){
            System.out.println(name);
        }

        //OOP
        //Product

        //instance => örnek
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(50);
        product.discount(10);
        //Constructor => yapıcı method
        Product product1 = new Product("Mause",10);
        product1.discount(5);

        System.out.println(product.getPrice());
        System.out.println(product1.getPrice());




    } /* Main metotunun scope bitişi */
} /* Main classının scope bitiş */