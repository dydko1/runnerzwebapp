package com.dydko.runnerzwebapp.model;

import com.dydko.runnerzwebapp.model.dto.ItemDto;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serialNumber;
    @ManyToOne
    private Cart cart;

    public static Item from(ItemDto itemDto){
        Item item = new Item();
        item.setSerialNumber(itemDto.getSerialNumber());
        return item;
    }
}