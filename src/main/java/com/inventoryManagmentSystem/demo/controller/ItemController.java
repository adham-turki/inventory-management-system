package com.inventoryManagmentSystem.demo.controller;

import com.inventoryManagmentSystem.demo.entity.Item;
import com.inventoryManagmentSystem.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired //@Autowired annotation is used for dependency injection.In spring boot application, all loaded beans are eligible for auto wiring to another bean. The annotation @Autowired in spring boot is used to auto-wire a bean into another bean.
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> items = itemService.findAllItems();
        return ResponseEntity.ok(items);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") Integer itemId) {
        return itemService.findItemById(itemId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        Item createdItem = itemService.saveItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable("id") Integer itemId, @RequestBody Item item) {
        Item updatedItem = itemService.updateItem(itemId, item);
        return ResponseEntity.ok(updatedItem);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Item> patchItem(@PathVariable("id") Integer itemId, @RequestBody Item item) {
        Item patchedItem = itemService.patchItem(itemId, item);
        return ResponseEntity.ok(patchedItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable("id") Integer itemId) {
        itemService.deleteItem(itemId);
        return ResponseEntity.noContent().build();
    }
}
