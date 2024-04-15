package com.inventoryManagmentSystem.demo.repository;

import com.inventoryManagmentSystem.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//repository to help with the database methods
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
