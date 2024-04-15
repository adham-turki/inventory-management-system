package com.inventoryManagmentSystem.demo.repository;

import com.inventoryManagmentSystem.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
//repository to help with the database methods
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
