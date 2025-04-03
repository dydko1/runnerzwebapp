package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
