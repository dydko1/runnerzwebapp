package com.dydko.runnerzwebapp.model;

import com.dydko.runnerzwebapp.model.dto.CartDto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "cart_id")
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public static Cart from(CartDto cartDto){
        Cart cart = new Cart();
        cart.setName(cartDto.getName());
        return cart;
    }
}