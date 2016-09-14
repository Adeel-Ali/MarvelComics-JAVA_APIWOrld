/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class ComicSummaryBuilder {
    //the instance to build
    private ComicSummary comicSummary;

    /**
     * Default constructor to initialize the instance
     */
    public ComicSummaryBuilder() {
        comicSummary = new ComicSummary();
    }

    /**
     * The canonical name of the comic.
     */
    public ComicSummaryBuilder name(String name) {
        comicSummary.setName(name);
        return this;
    }

    /**
     * The path to the individual comic resource.
     */
    public ComicSummaryBuilder resourceURI(String resourceURI) {
        comicSummary.setResourceURI(resourceURI);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ComicSummary build() {
        return comicSummary;
    }
}