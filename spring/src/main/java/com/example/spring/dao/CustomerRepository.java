package com.example.spring.dao;

import com.example.spring.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findByName(String name);
    List<Customer> findByNameLike(String name);

}
