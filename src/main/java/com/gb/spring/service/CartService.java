package com.gb.spring.service;

import com.gb.spring.model.Cart;
import com.gb.spring.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
Класс обслуживает запросы к корзине
 */
@Component
public class CartService {
    @Autowired
    CartRepository cr;

    public Cart add(){
        return cr.add(new Cart());
    }

}
