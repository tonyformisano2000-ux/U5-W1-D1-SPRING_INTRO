package com.example.U5_W1_D1_SPRING_INTRO.model;

public class Topping extends MenuItems{
    private String name;

    public Topping(int calories, double price ,String nome){
        super(calories, price);
    setName(nome);
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                '}';
    }
}
