package com.phantom;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Product {
    private int id;
    private String title;
    private double cost;

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Product(int id,String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
}
