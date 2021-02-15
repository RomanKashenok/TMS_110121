package com.example.demo.repository;

import com.example.demo.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MovieRepository {

    public List<Movie> movies = new ArrayList<>();

    public void store(Movie movie) {
        if(movie.getId() == null) {
            throw new IllegalArgumentException("У фильма должен быть ID!!!");
        }
        if (movies.stream().anyMatch(it -> it.getId().equals(movie.getId()))) {
            throw new IllegalArgumentException("У фильма должен быть уникальный ID!!!");
        }
        movies.add(movie);
    }

    public Movie fetch(long id) {
        return movies.stream().filter(it -> it.getId() == id).findFirst().orElseThrow(() -> new IllegalArgumentException("Нет такого фильмма!!!"));
    }

    public Movie get(String name) {
        return movies.stream().filter(it -> it.getName().equalsIgnoreCase(name)).findFirst().orElseThrow(() -> new IllegalArgumentException("Нет такого фильмма!!!"));
    }

    public void delete(Long id) {
        movies.removeIf(m -> m.getId().equals(id));
    }

    public void update(Long id, Movie movie) {
        movies.stream().filter(it -> it.getId().equals(id))
                .findFirst().ifPresent(it -> {
                    it.setGenre(movie.getGenre());
                    it.setName(movie.getName());
                });
    }

    public List<Movie> getByGenre(String genre) {
        return movies.stream().filter(it -> it.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
    }
}
