package com.order.in.service;

import com.order.in.model.Order;

import java.util.List;

public interface OrderService {

    public  Order placeOrder(Order order);
    public List<Order> getAllOrders();

    public Order findOrder(Long orderId);

}
