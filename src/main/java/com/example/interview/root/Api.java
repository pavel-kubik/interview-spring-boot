package com.example.interview.root;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Api {

    CustomerRepository customerRepository;
    RocketScienceLogic myLogic;

    @GetMapping("/customer")
    public void createCustomer(String name) {
        Customer novyCustomer = new Customer();
        customerRepository.save(novyCustomer);
    }

    @GetMapping("/messages/{name}/read")
    public void markAllMessagesRead(String name) {
        myLogic.markAllRead(name);
    }
}
