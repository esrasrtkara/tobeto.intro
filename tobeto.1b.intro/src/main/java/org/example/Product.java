package org.example;
//Her class default olarak boş bir constructor ile başlar.
public class Product {
    public Product(){
        System.out.println("Boş ctor çalıştırıldı");
    }
    public Product(String name){
        System.out.println("Name  parametresi ile  çalıştırıldı");
    }
    public Product(String name,double price){
        this.name=name;
        this.price=price;

    }
    String name;
    double price;

    //erişim_belirleyici dönüş_tipi method_ismi(){}
    public void discount(double discount){
        price = price - discount;
    }
    //Method Overloading  aynı isimdeki bir methodu farklı parametrelerle oluturmaktır.
    public  void  discount(){
        price = price - 10;
    }
}
