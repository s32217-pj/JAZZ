package com.pjatk.Osk.Nie.Services;

import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pjatk.Osk.Nie.Models.Movie;
import com.pjatk.Osk.Nie.Repositories.MovieRepository;

@Service
public class MovieService {
    private MovieRepository moviesRepo;
    
    public MovieService(MovieRepository moviesRepo){
        this.moviesRepo = moviesRepo;
    }

    public Map<Long,Movie> getAllMovies(){
        return moviesRepo.ReturnAllMovies();
    }

    public Optional<Movie> getMovieByID(long id){
        return moviesRepo.findByID(id);
    }

    public void addMovie(Movie movie){
        if(movie==null)
            return;

        this.moviesRepo.add(movie);
    }

    public boolean isValidMovie(Movie movie){
        return !(movie == null || movie.getName() == null || movie.getCategory() == null || movie.getDirector() == null);
    }

    public void addIfValid(Movie movie){
        if(isValidMovie(movie)){
            addMovie(movie);
            return;
        }

        throw new NullPointerException("Movie was not valid!");
    }

    public void updateIfValid(long id, Movie movie){
        if(!isValidMovie(movie) || moviesRepo.findByID(id).isEmpty())
            throw new NullPointerException("Movie was not valid or does not exist!");
        moviesRepo.update(id, movie);
    }

    public void removeIfValid(long id){
        var movie = moviesRepo.findByID(id);
        if(movie.isEmpty())
            throw new NullPointerException("Movie with id: " + id + " does not exist!");
        
        moviesRepo.remove(id);
    }
}
