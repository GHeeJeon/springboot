package com.example.spring;

import com.example.spring.dao.CustomerRepository;
import com.example.spring.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        super();
        this.repository = repository;
    }

    @PutMapping("/customer") // 새로운 리소스를 생성
    public Customer putCustomer(Customer customer) {
        return repository.save(customer);
    }

    @PostMapping("/customer") // 양식을 제출하기 위한 것
    public Customer postCustomer(Customer customer) {
        return repository.save(customer);
    }

    @DeleteMapping("/customer")
    public void deleteCustomer(int id) {
        repository.deleteById(id);
    }

    @GetMapping("/customer")
    // findById 의 리턴값은 Optional, 'null 일 수도 있는 객체' 를 감싸는 일종의 Wrapper 클래스
    public Customer getCustomer(int id) {
        return repository.findById(id).orElseThrow();
    }
    // orElse(null) 일 경우 없는 아이디를 조회했을 때 아무것도 뜨지 않는다.(null)

    @GetMapping("/customer/name")
    public List<Customer> getCustomer(String name) {
        return repository.findByName(name);
    }

    @GetMapping("/customer/search")
    public List<Customer> searchCustomer(String name) {
        return repository.findByNameLike("%" + name + "%");
    }

    @GetMapping("/customer/list")
    public List<Customer> getCustomerList(){
        return (List<Customer>) repository.findAll();
    }
}
