package com.example.interview.root;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RocketScienceLogic {

    CustomerRepository customer;
    MessageRepository message;

    public void markAllRead(String customerName) {
        markAllRead(customer.findById(customerName).get());
    }

    @Transactional
    public void markAllRead(Customer customer) {
        List<Message> allMessages = message.findByToCustomer(customer.getName());
        allMessages.forEach(m -> m.setRead(true));
        message.saveAll(allMessages);
    }
}
