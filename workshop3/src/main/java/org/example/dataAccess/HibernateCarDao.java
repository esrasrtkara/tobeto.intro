package org.example.dataAccess;

public class HibernateCarDao implements CarDao{
    @Override
    public void add(int id) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void update(int id) {
        System.out.println("Hibernate ile veritabanı güncellendi.");
    }

    @Override
    public void get(String brand) {
        System.out.println("Hibernate ile "+ brand + " araba verisi getirildi.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Hibernate ile " + id + " nolu id veritabanından silindi.");
    }
}
