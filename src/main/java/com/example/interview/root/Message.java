package com.example.interview.root;

import lombok.Data;

@Data
public class Message {
    private String fromCustomer;
    private String toCustomer;
    private String Text;
    private Boolean read;
}
