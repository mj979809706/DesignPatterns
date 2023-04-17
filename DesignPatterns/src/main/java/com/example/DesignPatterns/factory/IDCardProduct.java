package com.example.DesignPatterns.factory;

/**
 * @author admin
 */
public class IDCardProduct extends Product{

    public String owner;

    public IDCardProduct(String owner){
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("用户"+owner+"正在使用");
    }
    public String getOwner(){
        return owner;
    }
}
