package ru.netology.db;

import java.util.UUID;

public class MyEntity {
    private UUID id;
    private String name;

    public MyEntity(String name) {
        this.name = name;
    }

    // Можно добавить геттеры и сеттеры
}