package com.zb.entity;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;
    private String name;
    private String title;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Order(){}
    public Order(Integer id, String name, String title, Double price) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;
    }
}
