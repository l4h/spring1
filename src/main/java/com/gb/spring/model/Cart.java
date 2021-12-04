package com.gb.spring.model;


import java.util.ArrayList;
import java.util.List;

/*
Можно сделать этот класс бином, с аннотацией @Scope("prototype") и тогда будет создаваться новый экземпляр объекта, когда мы будем запрашивать его у контекста.
Но я сделал для этого сервис, т.к. корзина явно будет не одна.
 */
//@Component
//@Scope("prototype")
public class Cart {

    List<Product> products;

    public Cart(){
        products = new ArrayList<>();
    }

    public List<Product> list(){
        return products;
    }

    public boolean add(Product  product){
        return products.add(product);
    }

    public boolean addAll(List<Product> list){
        return products.addAll(list);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}
