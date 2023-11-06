package com.nebula.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nebula.entity.Item;
import com.nebula.repository.ItemRepository;


@Service
	
public class ItemService<itemRepository> {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(Long itemId) {
        return itemRepository.findById(itemId).orElse(null);
    }

    public Item createItem(Item item) {
    return itemRepository.save(item);
    }

    public Item updateItem(Long itemId, Item updatedItem) {
        if (itemRepository.existsById(itemId)) {
            updatedItem.setItemId(itemId);
            return itemRepository.save(updatedItem);
        }
        return null; // Item not found
    }

    public void deleteItem(Long itemId) {
        itemRepository.deleteById(itemId);
    }
}