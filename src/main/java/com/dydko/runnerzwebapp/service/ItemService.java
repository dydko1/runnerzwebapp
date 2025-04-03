package com.dydko.runnerzwebapp.service;

import com.dydko.runnerzwebapp.model.Item;
import com.dydko.runnerzwebapp.model.exception.ItemNotFoundException;
import com.dydko.runnerzwebapp.repository.ItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item addItem(Item item){
        return itemRepository.save(item);
    }

    public List<Item> getItems(){
        return StreamSupport
                .stream(itemRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Item getItem(Long id){
        return itemRepository.findById(id).orElseThrow(() ->
                new ItemNotFoundException(id));
    }

    public Item deleteItem(Long id){
        Item item = getItem(id);
        itemRepository.delete(item);
        return item;
    }

    @Transactional
    public Item editItem(Long id, Item item){
        Item itemToEdit = getItem(id);
        itemToEdit.setSerialNumber(item.getSerialNumber());
        return itemToEdit;
    }
}