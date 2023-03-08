package org.example;

public class Item {

    String id;
    String returnReason;
    String productCondition;
    int quantity;
    String comment;

    public Item setId(String id) {
        this.id = id;
        return this;
    }

    public Item setReturnReason(String returnReason) {
        this.returnReason = returnReason;
        return this;
    }

    public Item setProductCondition(String productCondition) {
        this.productCondition = productCondition;
        return this;
    }

    public Item setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Item setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
