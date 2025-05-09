package com.pjatk.Osk.Nie.Models;

public class Movie {
    private static long IDCounter = 0;

    private final long ID; //ID is get only
    private String name;
    private MovieCategory category;

    private String director;

    public Movie(String name, MovieCategory category, String director) {
        this.ID=IDCounter++;
        this.name = name;
        this.category = category;
        this.director = director;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieCategory getCategory() {
        return category;
    }

    public void setCategory(MovieCategory category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
