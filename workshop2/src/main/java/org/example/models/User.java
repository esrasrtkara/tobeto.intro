package org.example.models;

public class User {

    private int id;
    private String UserName;

    public User() {
    }

    public User(int id, String userName) {
        this.id = id;
        UserName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
