package com.inventoryManagmentSystem.demo.service.impl;

import com.inventoryManagmentSystem.demo.entity.Customer;
import com.inventoryManagmentSystem.demo.repository.CustomerRepository;
import com.inventoryManagmentSystem.demo.service.CustomerService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //To enable this class for component scanning
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findCustomerById(Integer customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Integer customerId, Customer customer) {
        Optional<Customer> existingCustomerOptional = customerRepository.findById(customerId);
        if (existingCustomerOptional.isPresent()) {
            Customer existingCustomer = existingCustomerOptional.get();
            existingCustomer.setCustomerName(customer.getCustomerName());
            return customerRepository.save(existingCustomer);
        } else {
            throw new EntityNotFoundException("Customer with ID " + customerId + " not found");
        }
    }

    @Override
    public Customer patchCustomer(Integer customerId, Customer customer) {
        Optional<Customer> existingCustomerOptional = customerRepository.findById(customerId);
        if (existingCustomerOptional.isPresent()) {
            Customer existingCustomer = existingCustomerOptional.get();
            if (customer.getCustomerName() != null) {
                existingCustomer.setCustomerName(customer.getCustomerName());
            }
            return customerRepository.save(existingCustomer);
        } else {
            throw new EntityNotFoundException("Customer with ID " + customerId + " not found");
        }
    }

    @Override
    public void deleteCustomer(Integer customerId) {
        customerRepository.deleteById(customerId);
    }
}
