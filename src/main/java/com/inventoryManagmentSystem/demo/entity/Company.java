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
@Table(name = "Company") //allows you to specify the details of the table that will be used to persist the entity in the database
public class Company {
    @Id //declare the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "companyId")
    private Integer companyId;
    private String companyName;
    private String location;

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }
}
