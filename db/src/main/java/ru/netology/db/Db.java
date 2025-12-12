package ru.netology.db;

public class Db {
    private DbSetting dbSetting;
    private MyEntity myEntity;

    public Db(DbSetting dbSetting) {
        this.dbSetting = dbSetting;
        myEntity = new MyEntity("default");
    }

    // Метод возвращает строку для демонстрации работы
    public String printSettings() {
        return "DB Name: " + dbSetting.getName();
    }
}