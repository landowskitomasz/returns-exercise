package org.example;

import java.util.Date;
import java.util.List;

public class ReturnRequest {

    public String order_number;
    public Date orderDate;
    public List<Item> items;

    public ReturnRequest setItems(List<Item> items) {
        this.items = items;
        return this;
    }
}
