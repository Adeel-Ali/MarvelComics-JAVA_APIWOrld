/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ComicPrice 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4635969018040802694L;
    private double price;
    private String type;
    /** GETTER
     * The price (all prices in USD).
     */
    @JsonGetter("price")
    public double getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * The price (all prices in USD).
     */
    @JsonSetter("price")
    public void setPrice (double value) { 
        this.price = value;
    }
 
    /** GETTER
     * A description of the price (e.g. print price, digital price).
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * A description of the price (e.g. print price, digital price).
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
 