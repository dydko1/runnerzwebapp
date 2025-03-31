package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
