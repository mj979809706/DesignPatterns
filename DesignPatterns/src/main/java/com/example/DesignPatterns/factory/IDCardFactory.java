package com.example.DesignPatterns.factory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author admin
 */
public class IDCardFactory extends Factory {

    List<String> owners = new CopyOnWriteArrayList<>();

    @Override
    public Product createProduct(String owner) {
        System.out.println("为" + owner + "创建产品");
        return new IDCardProduct(owner);
    }

    @Override
    public void registerProduct(Product p) {
        String owner = ((IDCardProduct) p).getOwner();
        owners.add(owner);
        System.out.println("为" + owner + "注册产品");
    }

    @Override
    public void getAllProductOwner() {
        owners.forEach(System.out::println);
    }
}
