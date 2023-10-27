package org.example.business;

import org.example.dataAccess.CarDao;
import org.example.entities.Car;

public class CarManager {
    private CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }
    public void add(Car car){
        System.out.print(car.getBrand() + " ");
        carDao.add(car.getId());
    }
    public void update(Car car,String name){
        System.out.print(car.getBrand() + ", ");
        car.setBrand(name);
        System.out.print(car.getBrand() + " olarak ");
        carDao.update(car.getId());
    }
    public void get(Car car){
        carDao.get(car.getBrand());
    }
    public void delete(Car car){

        carDao.delete(car.getId());
        car.setBrand("");
        car.setColor("");
        System.out.println("Barand : "+car.getBrand() + " Color : "+car.getColor());
    }

}
