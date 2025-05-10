package com.pjatk.Osk.Nie.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pjatk.Osk.Nie.Models.Movie;
import com.pjatk.Osk.Nie.Repositories.MovieRepository;

@Service
public class MovieService {
    private final MovieRepository moviesRepo;
    
    public MovieService(MovieRepository moviesRepo){
        this.moviesRepo = moviesRepo;
    }

    public List<Movie> getAllMovies(){
        return moviesRepo.findAll();
    }

    public Optional<Movie> getMovieByID(long id){
        return moviesRepo.findById(id);
    }

    public void addMovie(Movie movie){
        if(movie==null)
            return;

        this.moviesRepo.save(movie);
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

    public void updateIfValid(Long id, Movie movie){
        if(!isValidMovie(movie) || moviesRepo.findById(movie.getID()).isEmpty())
            throw new NullPointerException("Movie was not valid or does not exist!");
        
        var m = moviesRepo.findById(id).get();
        m = movie;
        moviesRepo.save(m);
    }

    public void removeIfValid(long id){
        var movie = moviesRepo.findById(id);
        if(movie.isEmpty())
            throw new NullPointerException("Movie with id: " + id + " does not exist!");
        
        moviesRepo.deleteById(id);
    }

    public void setAvailable(long id){
        var movie = moviesRepo.findById(id);
        if(movie.isEmpty())
            throw new NullPointerException("Movie with id: " + id + " does not exist!");

        movie.get().setAvailable(true);
        moviesRepo.save(movie.get());
    }
}
