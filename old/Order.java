package com.dydko.runnerzwebapp.old;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
//@Getter
//@Setter
@ToString
public class Order {

    @JsonProperty("customerName1")
    private String customerName;
    private String productName;
    private int quantity;
}
