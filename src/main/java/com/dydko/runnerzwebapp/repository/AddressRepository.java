package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
