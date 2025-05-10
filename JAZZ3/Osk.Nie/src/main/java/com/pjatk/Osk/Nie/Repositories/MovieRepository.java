package com.pjatk.Osk.Nie.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjatk.Osk.Nie.Models.Movie;
import com.pjatk.Osk.Nie.Models.MovieCategory;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByName(String name);
    List<Movie> findByCategory(MovieCategory category);
    List<Movie> findByDirector(String director);
}
