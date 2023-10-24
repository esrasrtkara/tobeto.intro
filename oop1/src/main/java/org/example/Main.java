package org.example;
//Java nesne yönelimli programlama dilidir.
//Nesne yönelimli yapılar bize sürdürebilirlik katar.

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        //Set
       /* product1.name = "Delonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl = "deneme.jpg";*/
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setImageUrl("deneme.jpg");
        product1.setUnitsInStock(3);

        //Get
       // System.out.println(product1.name);

        Product product2 = new Product();
        //Set
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(5);
        product2.setImageUrl("deneme2.jpg");
        product2.setUnitsInStock(4);

        Product product3 = new Product();
        //Set
        product3.setName("Fakir Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(8);
        product3.setImageUrl("deneme3.jpg");
        product3.setUnitsInStock(2);

        Product[] products = {product1,product2,product3};

        for (Product product:products)
        {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setCustomerNumber("1227377439439");
        individualCustomer.setId(1);
        individualCustomer.setPhone("8863792");
        individualCustomer.setFirstName("Esra");
        individualCustomer.setLastName("Akbulut");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(1);
        corporateCustomer.setCustomerNumber("153127");
        corporateCustomer.setPhone("6537490");
        corporateCustomer.setCompanyName("hjdhf");
        corporateCustomer.setTaxNumber("132324");

        //Inheritance yapılan sınıf referans değer tutar.
        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}