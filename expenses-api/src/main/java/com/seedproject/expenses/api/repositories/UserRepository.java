package com.seedproject.expenses.api.repositories;

import org.springframework.data.repository.CrudRepository;

import com.seedproject.expenses.api.entities.User;

public interface UserRepository extends CrudRepository <Long, User> {

}
