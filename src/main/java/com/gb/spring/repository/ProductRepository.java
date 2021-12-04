package com.gb.spring.repository;

import com.gb.spring.model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1, "milk", 69),
                new Product(2, "bread", 25),
                new Product(3, "potato", 20),
                new Product(4, "oil", 80)
        ));
    }

    public Product getById(int id) {
        return products.get(id);
    }

    public List<Product> getAll() {
        return products;
    }


    /*
    Добавил проверку на успешность добавления нового объекта, т.к. не знаю есть ли возможность, что у нас не получится добавить новый объект в список по каким-то причинам и программа при этом продолжит выполнение.
    По идее исключение должно прекратить выполнение программы, но что если нет?)) Считаю, что лучше получить null, чем вернуть не тот объект.
     */
    public Product add(String name, double cost) {
        return (products.add(new Product(products.size()+1, name, cost))) ? getById(products.size()-1) : null;
    }
}