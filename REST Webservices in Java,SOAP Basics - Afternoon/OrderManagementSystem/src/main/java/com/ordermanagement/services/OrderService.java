package com.ordermanagement.services;

import org.springframework.stereotype.Service;

import com.ordermanagement.model.Order;
import com.ordermanagement.model.OrderItem;
import com.ordermanagement.model.OrdersManagement;

import java.util.List;

@Service
public class OrderService {

    private int lastOrderIdGiven, lastItemIdGiven;
    private OrdersManagement orders;

    public OrderService(){
        this.lastOrderIdGiven = 0;
        this.lastItemIdGiven = 0;
        orders = new OrdersManagement();
    }

    public List<Order> getAllOrders(){
        return orders.getOrdersList();
    }
    public Order createOrder(Order order){
        order.setId(lastItemIdGiven++);
        orders.setOrdersList(order);
        return order;
    }
    
    public Order addItemToOrder(int orderId, OrderItem item){
        Order currentOrder = orders.getOrder(orderId);
        item.setId(++lastOrderIdGiven);
        if(currentOrder.addItem(item)) {
            return currentOrder;
        }
        return null;
    }

    public List<OrderItem> getOrderItems(int orderId){
        Order currentOrder = orders.getOrder(orderId);
        return currentOrder.getItemsList();
    }

    public boolean checkOrderItem(int orderId){
        Order currentOrder = orders.getOrder(orderId);
        if(currentOrder == null){
            return false;
        }
        return true;
    }
    public OrderItem updateItem(int itemId, int orderId, OrderItem item){
        Order currentOrder = orders.getOrder(orderId);
        item.setId(++lastOrderIdGiven);
        return currentOrder.updateOrderItem(itemId, item);
    }

    public boolean removeItemFromOrder(int orderId, int itemId){
        Order currentOrder = orders.getOrder(orderId);
        return currentOrder.removeItem(itemId);
    }

    public boolean removeOrder(int orderId){
        return orders.removeOrder(orderId);
    }
}
