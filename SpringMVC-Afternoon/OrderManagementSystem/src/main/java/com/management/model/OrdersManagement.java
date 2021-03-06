package com.management.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdersManagement {
    private HashMap<Integer, Order> orderList = new HashMap<>();

    public boolean setOrdersList(Order order) {
        if(orderList.containsKey(order.getId())){
            return false;
        }
        orderList.put(order.getId(), order);
        return true;
    }

    public boolean removeOrder(int orderId){
        this.orderList.remove(orderId);
        return true;
    }

    public List<Order> getOrdersList() {
        List<Order> orders = new ArrayList<>();
        for(Map.Entry<Integer, Order> entry : orderList.entrySet()){
            orders.add(entry.getValue());
        }
        return orders;
    }

    public Order getOrder(int orderId){
        if(orderList.containsKey(orderId)){
            return orderList.get(orderId);
        }
        return null;
    }
}