package org.example.dataAccess;

public class JdbcCarDao implements CarDao{
    @Override
    public void add(int id) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void update(int id) {
        System.out.println("JDBC ile veritabanı güncellendi.");
    }

    @Override
    public void get(String brand) {
        System.out.println("JDBC ile "+ brand + " araba verisi getirildi.");
    }

    @Override
    public void delete(int id) {
        System.out.println("JDBC ile " + id + " nolu id veritabanından silindi.");
    }
}
