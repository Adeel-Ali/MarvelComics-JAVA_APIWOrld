/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class EventDataContainerBuilder {
    //the instance to build
    private EventDataContainer eventDataContainer;

    /**
     * Default constructor to initialize the instance
     */
    public EventDataContainerBuilder() {
        eventDataContainer = new EventDataContainer();
    }

    /**
     * The total number of results returned by this call.
     */
    public EventDataContainerBuilder count(int count) {
        eventDataContainer.setCount(count);
        return this;
    }

    /**
     * The requested result limit.
     */
    public EventDataContainerBuilder limit(int limit) {
        eventDataContainer.setLimit(limit);
        return this;
    }

    /**
     * The requested offset (number of skipped results) of the call.
     */
    public EventDataContainerBuilder offset(int offset) {
        eventDataContainer.setOffset(offset);
        return this;
    }

    /**
     * The list of events returned by the call
     */
    public EventDataContainerBuilder results(List<Event> results) {
        eventDataContainer.setResults(results);
        return this;
    }

    /**
     * The total number of resources available given the current filter set.
     */
    public EventDataContainerBuilder total(int total) {
        eventDataContainer.setTotal(total);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EventDataContainer build() {
        return eventDataContainer;
    }
}