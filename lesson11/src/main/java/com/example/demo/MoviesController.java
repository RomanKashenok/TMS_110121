package com.example.demo;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// GET          .../movies
// GET          .../movies/search?genre=comedy
// GET          .../movies/{id}
// POST         .../movies
// DELETE       .../movies/{id}
// PUT          .../movies/{id}

@RestController
@RequestMapping(value = "/movies")
public class MoviesController {

    @Autowired
    private final MovieRepository movieRepository;

    public MoviesController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Movie> getMovies() {
        return movieRepository.movies;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Movie getMovie(@PathVariable(name = "id") Long id) {
        return movieRepository.fetch(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void storeMovie(@RequestBody Movie movie) {
        movieRepository.store(movie);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public Long deleteMovie(@PathVariable(name = "id") Long id) {
        movieRepository.delete(id);
        return id;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Movie updateMovie(@PathVariable(name = "id") Long id, @RequestBody Movie movie) {
        movieRepository.update(id, movie);
        return movie;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public List<Movie> searchByGenre(@RequestParam String genre) {
        return movieRepository.getByGenre(genre);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/saveMovie")
    public void saveWithGetDONTDOTHAT(@RequestParam String name,
                                             @RequestParam String genre,
                                             @RequestParam Long id) {
        Movie movie = new Movie(id, name, genre);
        movieRepository.store(movie);
    }
}
