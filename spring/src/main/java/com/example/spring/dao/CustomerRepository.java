package com.example.spring.dao;

import com.example.spring.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findByName(String name);
    List<Customer> findByNameLike(String name);
    List<Customer> findByNameLikeOrderByAddressAsc(String name);
    List<Customer> findByNameOrAddress(String name, String address);

    // @Query("from Customer where name = ?1 and address = ?2")
    // List<Customer> findVipList(String value1, String value2);
    @Query(value = "select * from Customer where name = ?1 and address = ?2", nativeQuery = true)
    List<Customer> findVipList(String value1, String value2);

}
