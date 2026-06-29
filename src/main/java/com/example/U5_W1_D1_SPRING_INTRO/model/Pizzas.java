package com.example.U5_W1_D1_SPRING_INTRO.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizzas extends MenuItems{
    private String name;
    private List<Topping> toppingsList=new ArrayList<>();

    public Pizzas(int calories, double price, String name, List<Topping> toppingsList){
super(calories, price);
setName(name);
List<Topping> aggiungoBase=new ArrayList<>(toppingsList);
aggiungoBase.add(new Topping(83, 0.80, "pomodoro"));
aggiungoBase.add(new Topping(120, 1.00, "mozzarella"));
setToppingsList(aggiungoBase);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topping> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<Topping> toppingsList) {
        this.toppingsList = toppingsList;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "name='" + name + '\'' +
                ", toppingsList=" + toppingsList +
                '}';
    }
}
