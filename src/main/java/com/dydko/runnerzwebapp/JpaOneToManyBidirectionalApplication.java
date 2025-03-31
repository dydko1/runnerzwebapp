package com.dydko.runnerzwebapp;


import com.dydko.runnerzwebapp.model.Cart;
import com.dydko.runnerzwebapp.model.Item;
import com.dydko.runnerzwebapp.repository.CartRepository;
import com.dydko.runnerzwebapp.repository.ItemRepository;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Log
public class JpaOneToManyBidirectionalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(JpaOneToManyBidirectionalApplication.class, args);

        CartRepository cartRepository = configurableApplicationContext.getBean(CartRepository.class);
        ItemRepository itemRepository = configurableApplicationContext.getBean(ItemRepository.class);

        Cart cart = new Cart("C123");
        Item chocolate = new Item("1223", cart);
        Item lollipop = new Item("2332", cart);
        List<Item> items = Arrays.asList(chocolate, lollipop);
        cart.setItems(items);
        cartRepository.save(cart);
    }
}