package com.example.spring;

import com.example.spring.dao.CustomerRepository;
import com.example.spring.entity.Customer;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        super();
        this.repository = repository;
    }

    @PutMapping("/customer")
    public Customer putCustomer(Customer customer) {
        return repository.save(customer);
    }

    @PostMapping("/customer")
    public Customer postCustomer(Customer customer) {
        return repository.save(customer);
    }

    @DeleteMapping("/customer")
    public void deleteCustomer(int id) {
        repository.deleteById(id);
    }
}
