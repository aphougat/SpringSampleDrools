package com.itembryo.drools.spring.dto;

/**
 * Created by abhayphougat on 10/06/17.
 */
public class Item {

    private Category category;

    private Double cost;

    public Item(Double cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
