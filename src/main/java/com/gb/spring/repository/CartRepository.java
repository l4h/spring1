package com.gb.spring.repository;

import com.gb.spring.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CartRepository {

    List<Cart> carts;

    @PostConstruct
    public void init(){
        carts = new ArrayList<>();
    }

    public Cart add(Cart cart) {
        return (carts.add(cart)) ? getById(carts.size() - 1) : null;
    }

    public Cart getById(int id) {
        return carts.get(id);
    }


}
