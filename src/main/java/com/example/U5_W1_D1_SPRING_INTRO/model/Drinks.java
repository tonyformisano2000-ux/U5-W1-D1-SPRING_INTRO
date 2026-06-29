package com.example.U5_W1_D1_SPRING_INTRO.model;

public class Drinks extends MenuItems{
    private String name;
    private double quantity;
    private int alcoholicGradation;

    public Drinks(int calories, double price, String name, double quantity){
        super(calories, price);
setName(name);
setQuantity(quantity);
    }
    public Drinks(int calories, double price, String name, double quantity, int alcoholicGradation){
        super(calories, price);
        this.name=name;
        this.quantity=quantity;
        this.alcoholicGradation=alcoholicGradation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getAlcoholicGradation() {
        return alcoholicGradation;
    }

    public void setAlcoholicGradation(int alcoholicGradation) {
        this.alcoholicGradation = alcoholicGradation;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", alcoholicGradation=" + alcoholicGradation +
                '}';
    }
}
