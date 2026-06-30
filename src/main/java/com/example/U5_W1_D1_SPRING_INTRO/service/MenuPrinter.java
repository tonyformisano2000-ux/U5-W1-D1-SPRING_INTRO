package com.example.U5_W1_D1_SPRING_INTRO.service;

import com.example.U5_W1_D1_SPRING_INTRO.model.Menu;
import com.example.U5_W1_D1_SPRING_INTRO.model.Order;
import org.springframework.stereotype.Component;

@Component
public class MenuPrinter {
    public void printMenu(Menu menu){
        System.out.println("===== MENU DEL GIORNO =====");
        System.out.println("\n--- PIZZE ---");
        menu.getPizzasList().forEach(System.out::println);

        System.out.println("\n--- BEVANDE ---");
        menu.getDrinksList().forEach(System.out::println);

        System.out.println("\n--- TOPPINGS ---");
        menu.getToppingList().forEach(System.out::println);
    }

    public void stampaOrdine(Order order) {
        System.out.println("\n===== ORDINE #" + order.getOrderNumber() + " =====");
        System.out.println(order);
    }
}
