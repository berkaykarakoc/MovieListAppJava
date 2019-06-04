package presentation;

import java.util.List;

import business.Movie;

public class MovieListView {

    public static void printMovieDetails(Movie movie) {
        System.out.println(movie.getName());
    }

    public void printMovieList(List<Movie> movieList) {
        System.out.println("---------------------");
        int counter = 1;
        for (Movie movie: movieList) {
            System.out.print(counter + ": ");
            printMovieDetails(movie);
            counter++;
        }
        System.out.println("---------------------");
    }

}
