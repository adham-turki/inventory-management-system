package com.inventoryManagmentSystem.demo.service;

import com.inventoryManagmentSystem.demo.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    // Post
    Customer saveCustomer(Customer customer);

    // Get
    Optional<Customer> findCustomerById(Integer customerId);
    List<Customer> findAllCustomers();

    // Update
    Customer updateCustomer(Integer customerId, Customer customer);

    //Patch
    Customer patchCustomer(Integer customerId, Customer customer);
    // Delete
    void deleteCustomer(Integer customerId);
}
