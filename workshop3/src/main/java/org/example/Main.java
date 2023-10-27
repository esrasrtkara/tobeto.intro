package org.example;


import org.example.business.CarManager;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) {

        CarManager carManager = new CarManager(new HibernateCarDao());
        Car car1 = new Car();
            car1.setBrand("Renault");
            car1.setId(1);
            car1.setColor("Red");
        carManager.add(car1);
        carManager.update(car1,"Fiat");
        carManager.get(car1);
        carManager.delete(car1);

    }
}