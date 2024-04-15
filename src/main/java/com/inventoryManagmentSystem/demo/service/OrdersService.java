package com.inventoryManagmentSystem.demo.service;

import com.inventoryManagmentSystem.demo.entity.Orders;

import java.util.List;
import java.util.Optional;

public interface OrdersService {
    // Post
    Orders saveOrder(Orders order);

    // Get
    Optional<Orders> findOrderById(Integer orderId);
    List<Orders> findAllOrders();

    // Update
    Orders updateOrder(Integer orderId, Orders order);

    //Patch
    Orders patchOrder(Integer orderId, Orders order);

    // Delete
    void deleteOrder(Integer orderId);
}
