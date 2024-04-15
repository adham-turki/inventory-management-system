package com.inventoryManagmentSystem.demo.repository;

import com.inventoryManagmentSystem.demo.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
//repository to help with the database methods
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
