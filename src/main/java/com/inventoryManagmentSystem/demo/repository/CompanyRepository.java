package com.inventoryManagmentSystem.demo.repository;

import com.inventoryManagmentSystem.demo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
//repository to help with the database methods
public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
