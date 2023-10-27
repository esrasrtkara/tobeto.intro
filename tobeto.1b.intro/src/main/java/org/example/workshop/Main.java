package org.example.workshop;

public class Main {
    public static void main(String[] args) {

        DbManager dbManager = new PostgreSql();
        dbManager.add();
        dbManager.update();
    }
}
