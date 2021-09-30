package com.simplilearn.phase3.dao;



import org.springframework.data.repository.CrudRepository;

import com.simplilearn.phase3.model.EProduct;

// This will be AUTO IMPLEMENTED by Spring into a Bean called ProductRepository
// CRUD refers Create, Read, Update, Delete

public interface ProductRepository extends CrudRepository<EProduct, Integer> {

}