package com.kannanrnivas.interiew.models;

/**
 * Class of a Model Product
 *
 * @author KannanRNivas
 */
public class ProductModel {
    long id;
    String name;

    public ProductModel(long id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the product id
     * @return the product id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the product id
     * @param id the product id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the product name
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the product name
     * @param name the product name
     */
    public void setName(String name) {
        this.name = name;
    }
}
