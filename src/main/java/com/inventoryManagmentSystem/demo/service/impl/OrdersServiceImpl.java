package com.inventoryManagmentSystem.demo.service.impl;

import com.inventoryManagmentSystem.demo.entity.Orders;
import com.inventoryManagmentSystem.demo.repository.OrdersRepository;
import com.inventoryManagmentSystem.demo.service.OrdersService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //To enable this class for component scanning
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public Orders saveOrder(Orders order) {
        return ordersRepository.save(order);
    }

    @Override
    public Optional<Orders> findOrderById(Integer orderId) {
        return ordersRepository.findById(orderId);
    }

    @Override
    public List<Orders> findAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders updateOrder(Integer orderId, Orders order) {
        Optional<Orders> existingOrderOptional = ordersRepository.findById(orderId);
        if (existingOrderOptional.isPresent()) {
            Orders existingOrder = existingOrderOptional.get();
            existingOrder.setCustomer(order.getCustomer());
            existingOrder.setOrderPrice(order.getOrderPrice());
            existingOrder.setDate(order.getDate());
            existingOrder.setQuantity(order.getQuantity());
            return ordersRepository.save(existingOrder);
        } else {
            throw new EntityNotFoundException("Order with ID " + orderId + " not found");
        }
    }

    @Override
    public Orders patchOrder(Integer orderId, Orders order) {
        Optional<Orders> existingOrderOptional = ordersRepository.findById(orderId);
        if (existingOrderOptional.isPresent()) {
            Orders existingOrder = existingOrderOptional.get();
            if (order.getCustomer() != null) {
                existingOrder.setCustomer(order.getCustomer());
            }
            if (order.getOrderPrice() != 0) {
                existingOrder.setOrderPrice(order.getOrderPrice());
            }
            if (order.getDate() != null) {
                existingOrder.setDate(order.getDate());
            }
            if (order.getQuantity() != 0) {
                existingOrder.setQuantity(order.getQuantity());
            }
            return ordersRepository.save(existingOrder);
        } else {
            throw new EntityNotFoundException("Order with ID " + orderId + " not found");
        }
    }

    @Override
    public void deleteOrder(Integer orderId) {
        ordersRepository.deleteById(orderId);
    }
}
