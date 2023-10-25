package org.example;
// public,private,protected
//Her class default olarak boş bir constructor ile başlar.
public class Product {
    public Product(){
        System.out.println("Boş ctor çalıştırıldı");
    }
    public Product(String name){
        System.out.println("Name  parametresi ile  çalıştırıldı");
    }
    public Product(String name,double price){
        //this classı belirtir.
        this.name=name;
        this.price=price;

    }
    //private =>Sadece class içinden erişim sağlanır.
    private  String name;
    private double price;

    //getter-setter
    //okuma-yazma public fonksiyon

    //sadece getter varsa read-only
    //sadece setter varsa write-only
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //erişim_belirleyici dönüş_tipi method_ismi(){}
    public void discount(double discount){
        price = price - discount;
    }
    //Method Overloading  aynı isimdeki bir methodu farklı parametrelerle oluturmaktır.
    public  void  discount(){
        price = price - 10;
    }
}
