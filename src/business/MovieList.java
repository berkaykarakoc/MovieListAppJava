package business;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

    private List<Movie> movieList;

    public MovieList() {
        this.movieList = new ArrayList<Movie>();
    }

    public void addMovie(Movie movie) {
        this.movieList.add(movie);
    }

    public void removeMovie(int index) {
        this.movieList.remove(index);
    }

    public List<Movie> getMovieList() {
        return this.movieList;
    }

}
