package com.gb.spring.model;

public class Product {
    private int id;
    private double cost;
    private String name;

    public Product(int id, String name, double cost) {
        this.id = id;
        this.cost = cost;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCoast() {
        return cost;
    }

    public void setCoast(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                "}\n";
    }
}
