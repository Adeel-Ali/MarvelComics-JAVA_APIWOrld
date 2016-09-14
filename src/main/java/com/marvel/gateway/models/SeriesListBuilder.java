/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class SeriesListBuilder {
    //the instance to build
    private SeriesList seriesList;

    /**
     * Default constructor to initialize the instance
     */
    public SeriesListBuilder() {
        seriesList = new SeriesList();
    }

    /**
     * The number of total available series in this list. Will always be greater than or equal to the "returned" value.
     */
    public SeriesListBuilder available(int available) {
        seriesList.setAvailable(available);
        return this;
    }

    /**
     * The path to the full list of series in this collection.
     */
    public SeriesListBuilder collectionURI(String collectionURI) {
        seriesList.setCollectionURI(collectionURI);
        return this;
    }

    /**
     * The list of returned series in this collection.
     */
    public SeriesListBuilder items(List<SeriesSummary> items) {
        seriesList.setItems(items);
        return this;
    }

    /**
     * The number of series returned in this collection (up to 20).
     */
    public SeriesListBuilder returned(int returned) {
        seriesList.setReturned(returned);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SeriesList build() {
        return seriesList;
    }
}