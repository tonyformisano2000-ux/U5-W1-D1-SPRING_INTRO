package com.example.U5_W1_D1_SPRING_INTRO.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private long orderNumber;
    private Table tableNumber;
    private OrderState state;
    private List<MenuItems> order;
    private LocalDateTime orderTime;
    private int numberOfCovers;
    private double bill;

    public Order(Table tableNumber, OrderState state, List<MenuItems> order, int numberOfCovers, long orderNumber){
        setTableNumber(tableNumber);
        setState(state);
        setNumberOfCovers(numberOfCovers);
        this.orderTime=LocalDateTime.now();
        setOrderNumber(orderNumber);
        setOrder(order);
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Table getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Table tableNumber) {
        this.tableNumber = tableNumber;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public List<MenuItems> getOrder() {
        return order;
    }

    public void setOrder(List<MenuItems> order) {
        this.order = order;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public int getNumberOfCovers() {
        return numberOfCovers;
    }

    public void setNumberOfCovers(int numberOfCovers) {
        this.numberOfCovers = numberOfCovers;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", tableNumber=" + tableNumber +
                ", state=" + state +
                ", order=" + order +
                ", orderTime=" + orderTime +
                ", numberOfCovers=" + numberOfCovers +
                ", bill=" + bill +
                '}';
    }
}
