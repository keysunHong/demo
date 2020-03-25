package com.example.demo.freemarker;

public class Animal {
    private String name;
    private double price;

    public Animal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
