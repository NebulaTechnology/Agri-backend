package com.nebula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nebula.entity.Item;
import com.nebula.service.ItemService;
@RestController
@RequestMapping("/api/v1/items")
public class ItemController {


    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{itemId}")
    public Item getItemById(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.createItem(item);
    }

    @PutMapping("/{itemId}")
    public Item updateItem(@PathVariable Long itemId, @RequestBody Item updatedItem) {
        return itemService.updateItem(itemId, updatedItem);
    }

    @DeleteMapping("/{itemId}")
    public void deleteItem(@PathVariable Long itemId) {
        itemService.deleteItem(itemId);
    }
}