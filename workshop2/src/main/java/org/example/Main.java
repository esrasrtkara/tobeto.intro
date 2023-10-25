/*
Bir e-ticaret sitesi için aşağıdaki modelleri class haline getiriniz.
Encapsulation uygulayınız ve constructorlar oluşturunuz.
Bunları main dosyasında oluşturarak bir kaç örnek kullanım ekleyiniz.

Modellerimiz:
Category
Product
Order
User
*/
package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setUserName("Esra");
        User user2 = new User(2,"Halil");

        Category category = new Category();
        category.setId(1);
        category.setCategoryName("Bakım");
        Category category2 = new Category(2,"Meyve");


        Product product = new Product();
        product.setId(1);
        product.setProductName("Duş jeli");
        product.setPrice(40);
        Product product2 = new Product(2,"Elma",20);

        Order order = new Order();
        order.setId(1);
        order.setQuantity(500);
        Order order2 = new Order(2,5);

        System.out.println("Müşterimiz "+ user.getUserName() +" "  + category.getCategoryName() + " bölümünden "+ order.getQuantity() + " adet "+ product.getProductName() +"ni " + product.getPrice() + " tl ye almıştır.");
        System.out.println("Müşterimiz "+ user2.getUserName() +" "  + category2.getCategoryName() + " bölümünden "+ order2.getQuantity() + " adet "+ product2.getProductName() +" yı " + product2.getPrice() + " tl ye almıştır.");




    }
}