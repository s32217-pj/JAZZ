package com.pjatk.Osk.Nie.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pjatk.Osk.Nie.Models.Movie;
import com.pjatk.Osk.Nie.Services.MovieService;

@RestController
public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> GetAllMovies(){
        return ResponseEntity.ok().body(new ArrayList<>(movieService.getAllMovies()));
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> GetMovieByID(@PathVariable long id){
        var movie = movieService.getMovieByID(id);

        if(movie.isEmpty())
            throw new NullPointerException("Movie with id:  " + id + " does not exist");

        return ResponseEntity.ok().body(movie.get());
    }

    @PostMapping("/movies/add")
    public ResponseEntity<Movie> PostMovie(@RequestBody Movie movie){
        movieService.addIfValid(movie);
        return ResponseEntity.ok().body(movie);
    }

    @PutMapping("/movies/update/{id}")
    public ResponseEntity<Movie> UpdateMovie(@PathVariable long id, @RequestBody Movie newMovie){
        movieService.updateIfValid(id, newMovie);
        return ResponseEntity.ok().body(newMovie);
    }

    @DeleteMapping("/movies/delete/{id}")
    public ResponseEntity<Void> RemoveMovie(@PathVariable long id){
        movieService.removeIfValid(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/movies/setavailable/{id}")
    public ResponseEntity<Void> SetMovieAvailable(@PathVariable long id){
        movieService.setAvailable(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
