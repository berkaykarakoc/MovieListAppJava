package business;

import controller.MovieController;
import presentation.Menu;
import presentation.MovieListView;
import dataaccess.DataAccess;

public class Program {

    private Menu menu;
    private MovieController controller;
    private DataAccess dataaccess;

    public Program() {
        this.menu = new Menu();
        this.dataaccess = new DataAccess();
    }

    public void run() {
        MovieList model = new MovieList();
        MovieList storedList = dataaccess.retrieveMovieListFromLocal();
        if (storedList != null) {
            model = storedList;
        }
        MovieListView view = new MovieListView();
        this.controller = new MovieController(model, view);

        while(true) {
            menu.printMenu();
            String input = menu.getInput();
            switch(input) {
                case "1":
                    controller.updateView();
                    continue;
                case "2":
                    String an = menu.getInput();
                    Movie movie = new Movie(an);
                    controller.addMovie(movie);
                    continue;
                case "3":
                    int rn = menu.getInteger();
                    if (rn <= controller.getMovieList().size()) {
                        controller.removeMovie(rn-1);
                        continue;
                    }
                    menu.printErrorMessage();
                    continue;
                case "4":
                    dataaccess.storeMovieListOnLocal(model);
                    continue;
                case "q":
                    System.exit(1);
            }

        }
    }

}
