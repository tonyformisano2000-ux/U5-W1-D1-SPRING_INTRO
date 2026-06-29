package com.example.U5_W1_D1_SPRING_INTRO.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
private List<Pizzas> pizzasList= new ArrayList<>();
    private List<Drinks> drinksList=new ArrayList<>();
    private List<Topping> toppingList=new ArrayList<>();

public Menu(List<Pizzas> pizzasList, List<Drinks> drinksList, List<Topping> toppingList){
    this.pizzasList=pizzasList;
    this.drinksList=drinksList;
    this.toppingList=toppingList;

}

    public List<Pizzas> getPizzasList() {
        return pizzasList;
    }

    public void setPizzasList(List<Pizzas> pizzasList) {
        this.pizzasList = pizzasList;
    }

    public List<Drinks> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<Drinks> drinksList) {
        this.drinksList = drinksList;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzasList=" + pizzasList +
                ", drinksList=" + drinksList +
                ", toppingList=" + toppingList +
                '}';
    }
}
