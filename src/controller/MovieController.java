package controller;

import java.util.List;
import business.Movie;
import business.MovieList;
import presentation.MovieListView;

public class MovieController {
    private MovieList movieList;
    private MovieListView movieListView;

    public MovieController(MovieList model, MovieListView view) {
        this.movieList = model;
        this.movieListView = view;
    }

    public void addMovie(Movie movie) {
        movieList.addMovie(movie);
    }

    public void removeMovie(int index) {
        movieList.removeMovie(index);
    }

    public List<Movie> getMovieList() {
        return movieList.getMovieList();
    }

    public void updateView() {
        movieListView.printMovieList(movieList.getMovieList());
    }
}
