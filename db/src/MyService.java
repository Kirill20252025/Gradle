package ru.netology.service;

import ru.netology.db.Db;
import ru.netology.db.DbSetting;

public class MyService {
    private Db db;

    public MyService() {
        db = new Db(new DbSetting("example_db", "passwd"));
    }

    // Простой метод для примера
    public String showDbInfo() {
        return db.printSettings();
    }
}