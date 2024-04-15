package com.inventoryManagmentSystem.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
//Generates getters for all fields, a useful toString method, and hashCode and equals implementations that check all non-transient fields

@AllArgsConstructor   //automatically generates a constructor with a parameter for each field in your class
@NoArgsConstructor     // generates a constructor with no parameter

@Entity  // specifies that the class is an entity and is mapped to a database table
@Table(name = "Orders") //allows you to specify the details of the table that will be used to persist the entity in the database
public class Orders {
    @Id //declare the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId")
    private Integer orderId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_customerId")
    private Customer customer;
    private float orderPrice;
    private String date;
    private int quantity;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
