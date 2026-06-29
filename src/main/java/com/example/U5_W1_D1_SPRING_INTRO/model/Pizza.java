package com.example.U5_W1_D1_SPRING_INTRO.model;

import java.util.ArrayList;
import java.util.List;
import java.util.spi.ToolProvider;

public class Pizza extends Pizzas {

    public Pizza(int calories, double price, String name, List<Topping> toppingsList){
        super(calories, price, name, toppingsList);
    }

}
