package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
