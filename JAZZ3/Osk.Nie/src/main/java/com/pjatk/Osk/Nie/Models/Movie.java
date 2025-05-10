package com.pjatk.Osk.Nie.Models;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long ID;

    private String name;
    private MovieCategory category;

    private String director;

    @Nonnull
    private boolean isAvailable = false;

    public Movie(){}
    public Movie(String name, MovieCategory category, String director) {
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

    public void setAvailable(boolean value){
        this.isAvailable = value;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

}
