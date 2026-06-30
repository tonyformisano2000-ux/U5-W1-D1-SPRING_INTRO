package com.example.U5_W1_D1_SPRING_INTRO.service;
import com.example.U5_W1_D1_SPRING_INTRO.model.MenuItems;
import com.example.U5_W1_D1_SPRING_INTRO.model.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Value("${table.serviceCost}")
    private double serviceCost;

    public double calculateTotal(Order order){
        double total=0;
        for (MenuItems item: order.getOrder()){
            total+= item.getPrice();
        }
        double totalService=serviceCost* order.getNumberOfCovers();
        return total+totalService;
    }
}
