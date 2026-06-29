package com.example.U5_W1_D1_SPRING_INTRO.model;

public abstract class MenuItems{
    private int calories;
    private  double price;

    public MenuItems(int calories, double price){
        setCalories(calories);
        setPrice(price);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "calories=" + calories +
                ", price=" + price +
                '}';
    }
}