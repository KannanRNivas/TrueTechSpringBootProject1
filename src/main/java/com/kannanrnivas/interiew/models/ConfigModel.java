package com.kannanrnivas.interiew.models;

/**
 * Class of a Model Config
 *
 * @author KannanRNivas
 */
public class ConfigModel {
    long id;
    String name;

    public ConfigModel(long id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the config id
     * @return the config id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the config id
     * @param id the config id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the config name
     * @return the config name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the config name
     * @param name the config name
     */
    public void setName(String name) {
        this.name = name;
    }
}
