package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
