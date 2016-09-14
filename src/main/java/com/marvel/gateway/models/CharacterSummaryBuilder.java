/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class CharacterSummaryBuilder {
    //the instance to build
    private CharacterSummary characterSummary;

    /**
     * Default constructor to initialize the instance
     */
    public CharacterSummaryBuilder() {
        characterSummary = new CharacterSummary();
    }

    /**
     * The full name of the character.
     */
    public CharacterSummaryBuilder name(String name) {
        characterSummary.setName(name);
        return this;
    }

    /**
     * The path to the individual character resource.
     */
    public CharacterSummaryBuilder resourceURI(String resourceURI) {
        characterSummary.setResourceURI(resourceURI);
        return this;
    }

    /**
     * The role of the creator in the parent entity.
     */
    public CharacterSummaryBuilder role(String role) {
        characterSummary.setRole(role);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CharacterSummary build() {
        return characterSummary;
    }
}