package com.inventoryManagmentSystem.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields

@AllArgsConstructor   //automatically generates a constructor with a parameter for each field in your class
@NoArgsConstructor     // generates a constructor with no parameter

@Entity  // specifies that the class is an entity and is mapped to a database table
@Table(name = "Customer") //allows you to specify the details of the table that will be used to persist the entity in the database
public class Customer {
    @Id //declare the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerId")
    private Integer customerId;
    private String customerName;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
