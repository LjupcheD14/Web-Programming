package mk.finki.ukim.mk.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mk.finki.ukim.mk.lab.model.Movie;
import mk.finki.ukim.mk.lab.service.MovieService;
import org.springframework.web.bind.annotation.RequestParam;
import mk.finki.ukim.mk.lab.service.implementation.MovieServiceImplementation;

import java.util.List;

@Controller
public class MovieController {

    private final MovieService movieService; // Inject MovieService

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public String getMoviesPage(Model model) {
        // Use the movieService instance to retrieve the list of movies
        List<Movie> movies = movieService.listAll();

        model.addAttribute("movies", movies);
        return "index";
    }
}
