package com.example.DesignPatterns.factory;

import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;

/**
 * @author admin
 */
public abstract class Factory {

    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product p);

    public abstract void getAllProductOwner();

    public Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        getAllProductOwner();
        return product;
    }
}
