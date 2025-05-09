package com.pjatk.Osk.Nie.Repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pjatk.Osk.Nie.Models.Movie;
import com.pjatk.Osk.Nie.Models.MovieCategory;

@Service
public class MovieRepository {
    public Map<Long, Movie> movies = new HashMap<>();

    public MovieRepository(){
        Movie mv1 = new Movie("Szklana pułapka", MovieCategory.HORROR, "Quentin Tarantino");
        Movie mv2 = new Movie("Kill Bill", MovieCategory.SCIFI, "Quentin Tarantino");
        movies.put(mv1.getID(), mv1);
        movies.put(mv2.getID(), mv2);
    }
    
    public Map<Long,Movie> ReturnAllMovies(){
        return this.movies;
    }

    public Optional<Movie> findByID(long id){
        return Optional.ofNullable(movies.get(id));
    }

    public void add(Movie movie){
        movies.put(movie.getID(), movie);
    }

    public void update(long id, Movie movie){
        movies.replace(id, movie);
    }

    public void remove(long id){
        movies.remove(id);
    }

}
