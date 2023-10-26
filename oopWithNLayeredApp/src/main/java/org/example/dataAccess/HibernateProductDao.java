package org.example.dataAccess;

import org.example.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        //Sadece ve sadece db erişim kodları buraya yazılır...SQL
        System.out.println("Hibernate ile veri tabanına eklendi.");
    }
}
