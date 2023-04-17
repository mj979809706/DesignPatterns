package com.example.DesignPatterns.factory;

/**
 * @author admin
 */
public class FactoryMain {

    public static void main(String[] args) {
        IDCardFactory idCardFactory = new IDCardFactory();
        Product p = idCardFactory.createProduct("hahha");
        idCardFactory.registerProduct(p);
        p.use();
        Product p1 = idCardFactory.createProduct("hehehoooo");
        idCardFactory.registerProduct(p1);
        p1.use();
        idCardFactory.getAllProductOwner();
    }
}
