package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
