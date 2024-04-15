package com.inventoryManagmentSystem.demo.service;

import com.inventoryManagmentSystem.demo.entity.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    // Post
    Item saveItem(Item item);

    // Get
    Optional<Item> findItemById(Integer itemId);
    List<Item> findAllItems();

    // Update
    Item updateItem(Integer itemId, Item item);

    //Patch
    Item patchItem(Integer itemId, Item item);


    // Delete
    void deleteItem(Integer itemId);
}
