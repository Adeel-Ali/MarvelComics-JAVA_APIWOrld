/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class EventBuilder {
    //the instance to build
    private Event event;

    /**
     * Default constructor to initialize the instance
     */
    public EventBuilder() {
        event = new Event();
    }

    /**
     * A resource list containing the characters which appear in this event.
     */
    public EventBuilder characters(CharacterList characters) {
        event.setCharacters(characters);
        return this;
    }

    /**
     * A resource list containing the comics in this event.
     */
    public EventBuilder comics(ComicList comics) {
        event.setComics(comics);
        return this;
    }

    /**
     * A resource list containing creators whose work appears in this event.
     */
    public EventBuilder creators(CreatorList creators) {
        event.setCreators(creators);
        return this;
    }

    /**
     * A description of the event.
     */
    public EventBuilder description(String description) {
        event.setDescription(description);
        return this;
    }

    /**
     * The date of publication of the last issue in this event.
     */
    public EventBuilder end(Date end) {
        event.setEnd(end);
        return this;
    }

    /**
     * The unique ID of the event resource.
     */
    public EventBuilder id(int id) {
        event.setId(id);
        return this;
    }

    /**
     * The date the resource was most recently modified.
     */
    public EventBuilder modified(Date modified) {
        event.setModified(modified);
        return this;
    }

    /**
     * A summary representation of the event which follows this event.
     */
    public EventBuilder next(EventSummary next) {
        event.setNext(next);
        return this;
    }

    /**
     * A summary representation of the event which preceded this event.
     */
    public EventBuilder previous(EventSummary previous) {
        event.setPrevious(previous);
        return this;
    }

    /**
     * The canonical URL identifier for this resource.
     */
    public EventBuilder resourceURI(String resourceURI) {
        event.setResourceURI(resourceURI);
        return this;
    }

    /**
     * A resource list containing the series in this event.
     */
    public EventBuilder series(SeriesList series) {
        event.setSeries(series);
        return this;
    }

    /**
     * The date of publication of the first issue in this event.
     */
    public EventBuilder start(Date start) {
        event.setStart(start);
        return this;
    }

    /**
     * A resource list containing the stories in this event.
     */
    public EventBuilder stories(StoryList stories) {
        event.setStories(stories);
        return this;
    }

    /**
     * The representative image for this event.
     */
    public EventBuilder thumbnail(Thumbnail thumbnail) {
        event.setThumbnail(thumbnail);
        return this;
    }

    /**
     * The title of the event.
     */
    public EventBuilder title(String title) {
        event.setTitle(title);
        return this;
    }

    /**
     * A set of public web site URLs for the event.
     */
    public EventBuilder urls(List<Url> urls) {
        event.setUrls(urls);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Event build() {
        return event;
    }
}