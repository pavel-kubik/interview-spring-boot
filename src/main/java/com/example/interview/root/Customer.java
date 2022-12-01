package com.example.interview.root;

import lombok.Data;

import java.util.List;

@Data
public class Customer {
    String name;
    List<Message> messageList;
}
