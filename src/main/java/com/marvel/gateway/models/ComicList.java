/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ComicList 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4975126028915363819L;
    private int available;
    private String collectionURI;
    private List<ComicSummary> items;
    private int returned;
    /** GETTER
     * The number of total available issues in this list. Will always be greater than or equal to the "returned" value.
     */
    @JsonGetter("available")
    public int getAvailable ( ) { 
        return this.available;
    }
    
    /** SETTER
     * The number of total available issues in this list. Will always be greater than or equal to the "returned" value.
     */
    @JsonSetter("available")
    public void setAvailable (int value) { 
        this.available = value;
    }
 
    /** GETTER
     * The path to the full list of issues in this collection.
     */
    @JsonGetter("collectionURI")
    public String getCollectionURI ( ) { 
        return this.collectionURI;
    }
    
    /** SETTER
     * The path to the full list of issues in this collection.
     */
    @JsonSetter("collectionURI")
    public void setCollectionURI (String value) { 
        this.collectionURI = value;
    }
 
    /** GETTER
     * The list of returned issues in this collection.
     */
    @JsonGetter("items")
    public List<ComicSummary> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * The list of returned issues in this collection.
     */
    @JsonSetter("items")
    public void setItems (List<ComicSummary> value) { 
        this.items = value;
    }
 
    /** GETTER
     * The number of issues returned in this collection (up to 20).
     */
    @JsonGetter("returned")
    public int getReturned ( ) { 
        return this.returned;
    }
    
    /** SETTER
     * The number of issues returned in this collection (up to 20).
     */
    @JsonSetter("returned")
    public void setReturned (int value) { 
        this.returned = value;
    }
 
}
 