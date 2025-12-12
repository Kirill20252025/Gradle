package ru.netology.api;

import ru.netology.service.MyService;

public class Main {
    public static void main(String[] args) {
        MyService service = new MyService();
        System.out.println(service.showDbInfo());
    }
}