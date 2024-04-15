package com.inventoryManagmentSystem.demo.service.impl;

import com.inventoryManagmentSystem.demo.entity.Item;
import com.inventoryManagmentSystem.demo.repository.ItemRepository;
import com.inventoryManagmentSystem.demo.service.ItemService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //To enable this class for component scanning
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Optional<Item> findItemById(Integer itemId) {
        return itemRepository.findById(itemId);
    }

    @Override
    public List<Item> findAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item updateItem(Integer itemId, Item item) {
        Optional<Item> existingItemOptional = itemRepository.findById(itemId);
        if (existingItemOptional.isPresent()) {
            Item existingItem = existingItemOptional.get();
            existingItem.setItemName(item.getItemName());
            existingItem.setCompany(item.getCompany());
            existingItem.setItemPrice(item.getItemPrice());
            existingItem.setQuantity(item.getQuantity());
            return itemRepository.save(existingItem);
        } else {
            throw new EntityNotFoundException("Item with ID " + itemId + " not found");
        }
    }

    @Override
    public Item patchItem(Integer itemId, Item item) {
        Optional<Item> existingItemOptional = itemRepository.findById(itemId);
        if (existingItemOptional.isPresent()) {
            Item existingItem = existingItemOptional.get();
            if (item.getItemName() != null) {
                existingItem.setItemName(item.getItemName());
            }
            if (item.getCompany() != null) {
                existingItem.setCompany(item.getCompany());
            }
            if (item.getItemPrice() != 0) {
                existingItem.setItemPrice(item.getItemPrice());
            }
            if (item.getQuantity() != null) {
                existingItem.setQuantity(item.getQuantity());
            }
            return itemRepository.save(existingItem);
        } else {
            throw new EntityNotFoundException("Item with ID " + itemId + " not found");
        }
    }
    @Override
    public void deleteItem(Integer itemId) {
        itemRepository.deleteById(itemId);
    }
}
