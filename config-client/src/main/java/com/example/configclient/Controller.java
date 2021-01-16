package com.example.configclient;

import com.richa.microserviceDemo.commons.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping(value="/customers",consumes = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer user){
       return customerRepository.save(user);
    }

    @RequestMapping("/customers")
    @PreAuthorize("hasAuthority('read_profile')")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @RequestMapping("/customer")
    @PreAuthorize("hasAuthority('read_profile')")
    public Customer getCustomerById(@RequestParam int customerId){
        Optional<Customer> customer = customerRepository.findById(customerId);
       if(customer.isPresent()){
           return customer.get();
       }
       return null;
    }
    @PutMapping("/customers")
    @PreAuthorize("hasRole('ROLE_editor')")
    public ResponseEntity<Customer> update(@RequestBody Customer customer){
        Optional<Customer> cust = customerRepository.findById(customer.getId());
        if(cust.isPresent()){
        return ResponseEntity.ok(customerRepository.save(customer));
        }
        else return ResponseEntity.notFound().build();
    }


}
