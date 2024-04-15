package com.inventoryManagmentSystem.demo.controller;

import com.inventoryManagmentSystem.demo.entity.Orders;
import com.inventoryManagmentSystem.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    private final OrdersService ordersService;

    @Autowired //@Autowired annotation is used for dependency injection.In spring boot application, all loaded beans are eligible for auto wiring to another bean. The annotation @Autowired in spring boot is used to auto-wire a bean into another bean.

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public ResponseEntity<List<Orders>> getAllOrders() {
        List<Orders> orders = ordersService.findAllOrders();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orders> getOrderById(@PathVariable("id") Integer orderId) {
        return ordersService.findOrderById(orderId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Orders> createOrder(@RequestBody Orders order) {
        Orders createdOrder = ordersService.saveOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Orders> updateOrder(@PathVariable("id") Integer orderId, @RequestBody Orders order) {
        Orders updatedOrder = ordersService.updateOrder(orderId, order);
        return ResponseEntity.ok(updatedOrder);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Orders> patchOrder(@PathVariable("id") Integer orderId, @RequestBody Orders order) {
        Orders patchedOrder = ordersService.patchOrder(orderId, order);
        return ResponseEntity.ok(patchedOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable("id") Integer orderId) {
        ordersService.deleteOrder(orderId);
        return ResponseEntity.noContent().build();
    }
}
