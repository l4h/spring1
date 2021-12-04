package com.gb.spring;

import com.gb.spring.model.Cart;
import com.gb.spring.model.Product;
import com.gb.spring.service.CartService;
import com.gb.spring.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService pr = context.getBean(ProductService.class);

        //Создадим 1 продукт вручную и затем отобразим весь ассортимент
        System.out.println(pr.createProduct("meet",285));
        System.out.println(pr.getAllProducts());
        //По заданию сервис не нужно было, но я думаю, что корзин будет много и решил сделать сервис.
        CartService cs = context.getBean(CartService.class);
        //Есть для нас разница получать корзину из контекста или получать из сервиса? разве что не пришлось бы в сервисе писать "new Cart()"
        Cart cart =cs.add();
        cart.addAll(pr.getAllProducts());
        cart.add(pr.createProduct("solt",10));
        System.out.println("Product in cart: " + cart.list());

        context.close();

    }

}
