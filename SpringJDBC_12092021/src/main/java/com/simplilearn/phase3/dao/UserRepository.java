package com.simplilearn.phase3.dao;



import org.springframework.data.repository.CrudRepository;

import com.simplilearn.phase3.model.EProduct;
import com.simplilearn.phase3.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called ProductRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}