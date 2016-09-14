/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class StoryDataContainerBuilder {
    //the instance to build
    private StoryDataContainer storyDataContainer;

    /**
     * Default constructor to initialize the instance
     */
    public StoryDataContainerBuilder() {
        storyDataContainer = new StoryDataContainer();
    }

    /**
     * The total number of results returned by this call.
     */
    public StoryDataContainerBuilder count(int count) {
        storyDataContainer.setCount(count);
        return this;
    }

    /**
     * The requested result limit.
     */
    public StoryDataContainerBuilder limit(int limit) {
        storyDataContainer.setLimit(limit);
        return this;
    }

    /**
     * The requested offset (number of skipped results) of the call.
     */
    public StoryDataContainerBuilder offset(int offset) {
        storyDataContainer.setOffset(offset);
        return this;
    }

    /**
     * The list of stories returned by the call
     */
    public StoryDataContainerBuilder results(List<Story> results) {
        storyDataContainer.setResults(results);
        return this;
    }

    /**
     * The total number of resources available given the current filter set.
     */
    public StoryDataContainerBuilder total(int total) {
        storyDataContainer.setTotal(total);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StoryDataContainer build() {
        return storyDataContainer;
    }
}