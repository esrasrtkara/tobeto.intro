package org.example.dataAccess;

public interface CarDao {

    void add(int id);
    void update(int id);
    void get(String brand);
    void delete(int id);

}
