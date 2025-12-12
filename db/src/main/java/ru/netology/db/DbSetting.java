package ru.netology.db;

import java.util.UUID;

public class DbSetting {
    private String name;
    private String password;

    public DbSetting(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Тут можно добавить геттеры и сеттеры
}